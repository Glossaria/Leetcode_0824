package Stack;

import java.util.ArrayList;
import java.util.Stack;

public class Solution_735 {

    public int[] asteroidCollision(int[] asteroids) {

        int n = asteroids.length;
        int idx = 0;
        ArrayList<Integer> res = new ArrayList<>();
        res.add(asteroids[idx++]);

        while (idx < n && idx >= 0) {
            res.add(asteroids[idx++]);

            while (res.size() > 1) {

                int last = res.getLast();
                int second = res.get(res.size() - 2);
                if (last < 0 && second > 0) {
                    if (Math.abs(last) > Math.abs(second)) {
                        res.remove(res.size() - 2);
                    } else if (Math.abs(last) < Math.abs(second)) {
                        res.removeLast();
                    } else {
                        res.removeLast();
                        res.removeLast();
                    }
                } else {
                    break;
                }
            }

        }

        return res.stream().mapToInt(Integer::intValue).toArray();

    }

    //stack
    public int[] asteroidCollision_2(int[] asteroids) {
        int n = asteroids.length;
        Stack<Integer> stack = new Stack<>();

        for(int num : asteroids){

            if(stack.empty()
                    || (stack.peek() > 0 && num > 0)
                    || (stack.peek() < 0 && num < 0)
                    || (stack.peek() < 0 && num > 0)
            ){
                stack.push(num);

            }else{
                boolean collision = true;

                while(collision && !stack.empty() && stack.peek() > 0 && num < 0){

                    collision = stack.peek() < Math.abs(num);

                    if(stack.peek() <= Math.abs(num)){
                        stack.pop();
                    }
                }
                if(collision) stack.push(num);
            }
        }


        int[] res = new int[stack.size()];
        int i = stack.size() - 1;
        while(!stack.empty()){
            res[i--] = stack.pop();
        }

        return res;
    }

}
