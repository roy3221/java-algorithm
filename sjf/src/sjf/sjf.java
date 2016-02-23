package sjf;

import java.util.Comparator;
import java.util.PriorityQueue;

public class sjf {
	public  class process {
        int arrTime;
        int exeTime;
        process(int arr, int exc) {
        		arrTime = arr;
                exeTime = exc;
        }
	}
	public float Solution(int[] req, int[] dur) {
		if (req == null || dur == null || req.length != dur.length)	return 0;
		int index = 0, length = req.length;
		int waitTime = 0, curTime = 0;
		PriorityQueue<process> pq = new PriorityQueue<process>(new MyComparator());
		while (!pq.isEmpty() || index < length) {
			if (!pq.isEmpty()) {
				process cur = pq.poll();
				waitTime += curTime - cur.arrTime;
				curTime += cur.exeTime;
				while (index < length && curTime >= req[index])
					pq.offer(new process(req[index], dur[index++]));
			}
			else {
				pq.offer(new process(req[index], dur[index]));
				curTime = req[index++];                       
				// current time= this process's arrive time. possible idle happen. when arrived, nextProIdx point to the next process.

			}
		}
		return (float) waitTime / length;
	}
	private class MyComparator implements Comparator<process>{
		
		public int compare(process p1, process p2) {
			if (p1.exeTime == p2.exeTime)
				return p1.arrTime - p2.arrTime;
			return p1.exeTime - p2.exeTime;
		}	
	}
 public static void main(String args[]){
	 int [] arrive={0,2,4,5}, excute={7,4,1,4};
	 System.out.println(new sjf().Solution(arrive, excute));
 }
	
}
