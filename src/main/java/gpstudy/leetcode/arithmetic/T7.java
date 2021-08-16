package gpstudy.leetcode.arithmetic;
/*给你一个 32 位的有符号整数 x ，返回 x 中每位上的数字反转后的结果。

如果反转后整数超过 32 位的有符号整数的范围 [−231,  231 − 1] ，就返回 0。

假设环境不允许存储 64 位整数（有符号或无符号）。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/reverse-integer
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/
public class T7 {
    public static int num(int i){
        int res=0;
        while (i!=0){
            int t = i % 10;
            int num=res;
            res = res*10 + t ;
            if((res-t)/10!=num){
               return 0;
            }
            i=i/10;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(num(-1234567899));
    }
}
