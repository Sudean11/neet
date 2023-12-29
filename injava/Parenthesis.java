package injava;

import java.util.ArrayList;
import java.util.List;

public class Parenthesis {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();

        backtrackParenthesis(list,"",0,0,n) ;
        return  list;
    }

    private void backtrackParenthesis(List<String> list, String str, int bracketOpen, int bracketClose, int max) {
        if(str.length() == max*2){
            list.add(str);
            return;
        }

        if(bracketOpen < max){
            backtrackParenthesis(list, str+"(", bracketOpen+1, bracketClose, max);
        }

        if(bracketClose < bracketOpen){
            backtrackParenthesis(list, str+")", bracketOpen, bracketClose+1, max);
        }
    }

    public static void main(String[] args) {
        System.out.println(new Parenthesis().generateParenthesis(16).size());
    }
}


