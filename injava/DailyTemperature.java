package injava;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemperature {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] noOfDays = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();

        //[73,74,75,71,69,72,76,73]
//        stack.push(0);

        for(int i =0; i<temperatures.length; i++){

            while(!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]){
                noOfDays[stack.peek()] = i-stack.pop();
            }

            stack.push(i);
        }

        return  noOfDays;
    }



    public static void main(String[] args) {
        System.out.println(Arrays.toString(new DailyTemperature().dailyTemperatures(new int[]{73,74,75,71,69,72,76,73})));
    }
}
