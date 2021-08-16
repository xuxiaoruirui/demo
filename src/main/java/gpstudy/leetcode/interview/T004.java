package gpstudy.leetcode.interview;

public class T004 {
    public static boolean canPermutePalindrome(String s) {
        char[] chars = s.toCharArray();
        int[] count = new int[128];
        int flag = 0;
        for(int i = 0; i < chars.length; i++){
            //当前为奇数，说明这次+1之后就为偶数，符合回文要求。flag--。
            if((count[chars[i]] & 1) == 1){
                flag--;
            }else{//当前为偶数，说明这次-1之后就为奇数，可能不符合回文要求，先记录下来。flag++。
                flag++;
            }
            count[chars[i]]++;
            //count[10]++;
        }
        //一串回文中，至多有一个出现次数为奇数的字符。
        if(flag > 1){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(canPermutePalindrome("avaaav"));

    }
}
