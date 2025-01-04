package Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Solution_649 {
    public String predictPartyVictory(String senate) {
        Queue<Integer> queue_r = new PriorityQueue<>();
        Queue<Integer> queue_d = new PriorityQueue<>();
        int n = senate.length();
        for (int i = 0; i < n; i++) {

            if (senate.charAt(i) == 'R') {
                queue_r.offer(i);
            } else {
                queue_d.offer(i);
            }
        }

        while (!queue_r.isEmpty() && !queue_d.isEmpty()) {

            int idx_r = queue_r.poll();
            int idx_t = queue_d.poll();

            if (idx_r < idx_t) {
                queue_r.offer(idx_r + n);
            } else {
                queue_d.offer(idx_t + n);
            }
        }

        return queue_r.isEmpty() ? "Dire" : "Radiant";
    }


}
