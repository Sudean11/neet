package injava;

import java.util.*;

public class ValidParenthesis {

    Boolean isValid(String yo){
        Stack<String> a = new Stack<>();

        Map<String, String> values = new HashMap<>();
        values.put("{", "}");
        values.put("(", ")");
        values.put("[", "]");
        if(yo.toCharArray().length == 1){
            return  false;
        }
        for(Character singleValue: yo.toCharArray()){
            if(values.containsKey(singleValue.toString())){
                a.push(singleValue.toString());
            }else{
                if(values.containsValue(singleValue.toString())){
                    if(a.isEmpty()){
                        return false;
                    }
                    String val = a.peek();
                    if(values.get(val).equals(singleValue.toString())){
                        a.pop();
                        continue;
                    }else{
                        System.out.println("here " + singleValue+ " values: "+ values.get(val));
                        return false;
                    }
                }else{
                    System.out.println("or here "+ singleValue + " and ");
                    return false;
                }
            }
        }
        if(a.isEmpty()){
            return true;
        }else {return false;}

    }

    public static void main(String[] args) {
        System.out.println(new ValidParenthesis().isValid("{}[}()"));
    }


}

