package gpstudy.leetcode.arithmetic;

/*
编写一个函数来查找字符串数组中的最长公共前缀。
如果不存在公共前缀，返回空字符串 ""。
* */
public class T14 {
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 0)
            return "";
        String str0 = strs[0];
        for (int i = 1; i < strs.length; i++) {
            int length = str0.length();
            String str1 = strs[i];
            int length1 = str1.length();
            int len = length > length1 ? length1 : length;
            int j = 0;
            for (; j < len; j++) {
                if (str0.charAt(j) != str1.charAt(j)) {
                    break;
                }
            }
            str0 = str0.substring(0, j);
            if (str0.equals("")) {
                return "";
            }
        }
        return str0;
    }

    public static void main(String[] args) {
        String[] s={"aaa","aa","aaa"};
        System.out.println(longestCommonPrefix(s));
    }
}
