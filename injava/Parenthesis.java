package injava;

import java.util.ArrayList;
import java.util.List;

public class Parenthesis {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();

        backtrackParenthesis(list,"",0,0);

        return  list;
    }

    private void backtrackParenthesis(List<String> list, String str, int bracketOpen, int bracketClose) {
        if(str.length() == 3*2){
            list.add(str);
            return;
        }

        if(bracketOpen < 3){
            backtrackParenthesis(list, str+"(", bracketOpen+1, bracketClose);
        }

        if(bracketClose < bracketOpen){
            backtrackParenthesis(list, str+")", bracketOpen, bracketClose+1);
        }
    }

    public static void main(String[] args) {
        System.out.println(new Parenthesis().generateParenthesis(3));
    }
}


