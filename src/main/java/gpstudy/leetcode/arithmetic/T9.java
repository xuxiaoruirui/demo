package gpstudy.leetcode.arithmetic;

/*给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。

回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。例如，121 是回文，而 123 不是。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/palindrome-number
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/
public class T9 {
    //t1.如果倒叙和正序值相等就可以
    public static boolean isPalindrome1(int x) {
        int x1 = x;
        if (x == 0) return true;
        if (x < 0 || x % 10 == 0) return false;
        int res = 0;
        while (x1 != 0) {
            int t = x1 % 10;
            res = res * 10 + t;
            x1 = x1 / 10;
        }
        if (res != x) return false;
        return true;
    }

    //t2.先取出位数
    public static boolean isPalindrome2(int x) {

        int x1 = x;
        if (x == 0) return true;
        if (x < 0 || x % 10 == 0) return false;
        int res = 1;
        while (x1/res>=10){
            res = res * 10;
        }
        while (x != 0) {
          int left=  x%10;
          int right= x/res;
          if(left!=right)return false;
          x=x%res/10;
          res=res/100;
        }
        return true;
    }

    public static void main(String[] args) {
       // System.out.println(isPalindrome1(12344321));
        System.out.println(isPalindrome2(10010001));
    }
}
