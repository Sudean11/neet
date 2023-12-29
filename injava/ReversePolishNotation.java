package injava;

import java.util.Stack;

public class ReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Stack<Integer> tokenStack = new Stack<>();
        for(String singleToken: tokens){
            try{
                int val = Integer.parseInt(singleToken);
                tokenStack.push(val);
            }catch (Exception e){
                int secondVal = tokenStack.pop();
                System.out.println("second Val: "+secondVal);
                int firstVal = tokenStack.pop();
                System.out.println("first Val: "+firstVal);

                switch (singleToken){
                    case "+":
                        tokenStack.push(firstVal+secondVal);
                        break;
                    case "-":
                        int push = firstVal - secondVal;
                        System.out.println(push);
                        tokenStack.push(firstVal-secondVal);
                        break;
                    case "*":
                        tokenStack.push(firstVal*secondVal);
                        break;
                    case "/":
                        tokenStack.push(firstVal/secondVal);
                        break;
                    default:
                        return -1;
                }
            }
        }
        return tokenStack.pop();
    }

    public static void main(String[] args) {
        System.out.println(new ReversePolishNotation().evalRPN(new String[]{"4","3","-"}));
    }
}
