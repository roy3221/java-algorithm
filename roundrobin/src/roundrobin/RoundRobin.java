package roundrobin;

import java.util.LinkedList;



public class RoundRobin {

public  class process {
        int arriveTime;
        int excuteTime;
        process(int arr, int exc) {
                arriveTime = arr;
                excuteTime = exc;
        }
}

// Assume arrive is sorted.
public  float roundRobin(int[] arrive, int[] excute, int q) {
        LinkedList<process> queue = new LinkedList<process>();
        int curTime = 0;// a point of current time
        int waitTime = 0;// the total wait time
        int nextProIdx = 0;// a point of next possible process
        while (!queue.isEmpty() || nextProIdx < arrive.length) {
                if (!queue.isEmpty()) {
                        process cur = queue.poll();
                        waitTime += curTime - cur.arriveTime;
                        System.out.println(waitTime);
                        System.out.println(curTime);
                        System.out.println(cur.arriveTime);
                        System.out.println();
                        curTime += Math.min(cur.excuteTime, q);
                        for (int i = nextProIdx; i < arrive.length; i ++) {
                                if (arrive[i] <= curTime) {
                                        queue.offer(new process(arrive[nextProIdx], excute[nextProIdx]));// next process arrive before current finish
                                        nextProIdx = i + 1;
                                } else {
                                        break;
                                }
                        }
                        if (cur.excuteTime > q) {
                                queue.offer(new process(curTime, cur.excuteTime - q));
                        }
                } else {
                	System.out.println("!!!!!!!!!!");
                        queue.offer(new process(arrive[nextProIdx], excute[nextProIdx]));
                        curTime = arrive[nextProIdx ++];
                        // current time= this process's arrive time. possible idle happen. when arrived, nextProIdx point to the next process.
                        System.out.println(curTime);
                        System.out.println();
                }
        }
   
        return (float)waitTime / arrive.length;
}
public static void main(String args[]){
	int[] arrive={0,1,4};
	int[] excute={5,2,3};
	int q=3;
	System.out.println(new RoundRobin().roundRobin(arrive, excute, q));
}
}
