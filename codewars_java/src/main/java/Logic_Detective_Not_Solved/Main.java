package Logic_Detective_Not_Solved;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        boolean a = LogicDetective.isPossible("(pORq)AND(!q)AND(!pORqOR!r)");
        //boolean b = LogicDetective.isPossible("(pORqORr)AND(pOR!qOR!r)AND(pOR!w)AND(!qOR!rOR!w)AND(!pOR!qORr)AND(uORx)AND(uOR!x)AND(qOR!u)AND(!rOR!u)");
        System.out.println(a);
        //System.out.println(b);
    }
}

class LogicDetective {
    public static boolean isPossible(String expression) {
        List<Character> trueList = new ArrayList<Character>();
        List<Character> falseList = new ArrayList<Character>();
        List<Character> insertList = new ArrayList<Character>();
        List<Character> removeList = new ArrayList<Character>();
        List<String> list = new ArrayList<String>(Arrays.asList(expression.split("AND")));

        expression = expression.replace("OR", "||");
        //System.out.println(expression);
        for (int i = 0; i < list.size(); i ++) {
            char[] temp = list.get(i).toCharArray();
            if(temp.length == 3) { // including "( )"
                if(falseList.contains(temp[1])) falseList.remove(falseList.indexOf(temp[1]));
                if(!trueList.contains(temp[1])) trueList.add(temp[1]);
            }
            for (int j = 1; j < temp.length; j++) {

            }
        }


        //list = new ArrayList<String>(array.toString());
        System.out.println(list);


        return true;
    }
    public static void  Evaluate(String s) {

    }
}