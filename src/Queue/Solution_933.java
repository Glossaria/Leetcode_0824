package Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Solution_933 {

    /**
     * Your RecentCounter object will be instantiated and called as such:
     * RecentCounter obj = new RecentCounter();
     * int param_1 = obj.ping(t);
     */
    public static Integer counter;
    public static Queue<Integer> pq;

    public void RecentCounter() {
        counter = 0;
        pq = new PriorityQueue<>();
    }

    public int ping(int t) {
        pq.add(t);

        if (!pq.isEmpty() && t - pq.peek() > 3000) {
            while (!pq.isEmpty() && t - pq.peek() > 3000) {
                pq.poll();
            }
        }
        return pq.size();

    }
}
