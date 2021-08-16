package gpstudy.leetcode.interview;


import java.util.Arrays;

public class T002 {
    public static boolean checkPermutation(String s1, String s2) {
        if(s1.length()!=s2.length()){
            return false;
        }
        char[] chars = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        Arrays.sort(chars);
        Arrays.sort(chars2);
        String string = Arrays.toString(chars);
        String string2 = Arrays.toString(chars2);
        System.out.println(string);
        System.out.println(string2);
        if (string.equals(string2)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkPermutation("abcd","dcba"));
    }
}
