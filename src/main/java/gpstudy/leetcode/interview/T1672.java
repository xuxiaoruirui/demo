package gpstudy.leetcode.interview;

public class T1672 {
    public static int accounts(int accounts[][]){
        int length=accounts.length;
        int max=0;
        for (int i = 0; i < length; i++) {
            int m=0;
            for (int j = 0; j <accounts[i].length ; j++) {
                m=m+accounts[i][j];
            }
           max=max>m?max:m;
        }
        return max;
    }
}
