package gpstudy.leetcode.arithmetic;

import java.util.Stack;

public class T20 {
    public static boolean isValid(String s) {
        if(s.length()/2!=0)
        return false;
        Stack<Character> stack=new Stack<>();
        for (int i = 0; i <s.length() ; i++) {
            stack.push(s.charAt(i));
        }
        stack.stream().map(sta->sta.charValue());

        return true;
    }


}
