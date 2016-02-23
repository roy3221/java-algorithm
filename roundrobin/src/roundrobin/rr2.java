package roundrobin;

import java.util.LinkedList;

public class rr2 {

public class process {
        int arriveTime;
        int excuteTime;
        process(int arr, int exc) {
                arriveTime = arr;
                excuteTime = exc;
        }
}

// Assume arrive is sorted.
public double roundRobin(int[] arrive, int[] excute, int q) {
        LinkedList<process> queue = new LinkedList<>();
        int curTime = 0;
        int waitTime = 0;
        int nextProIdx = 0;
        while (!queue.isEmpty() || nextProIdx < arrive.length) {
                if (!queue.isEmpty()) {
                        process cur = queue.poll();
                        waitTime += curTime - cur.arriveTime;
                        curTime += Math.min(cur.excuteTime, q);
                        for (int i = nextProIdx; i < arrive.length; i ++) {
                                if (arrive[i] <= curTime) {
                                        queue.offer(new process(arrive[i], excute[i]));
                                        nextProIdx = i + 1;
                                } else {
                                        break;
                                }
                        }
                        if (cur.excuteTime > q) {
                                queue.offer(new process(curTime, cur.excuteTime - q));
                        }
                } else {
                        queue.offer(new process(arrive[nextProIdx], excute[nextProIdx]));
                        curTime = arrive[nextProIdx ++];
                }
        }
        
        return (double)waitTime / arrive.length;
}

	
}
