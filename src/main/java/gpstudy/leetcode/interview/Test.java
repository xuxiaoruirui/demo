package gpstudy.leetcode.interview;

import java.util.Arrays;

/**
 * @author Rui.Xu Email:rui.xu@gshopper.com
 * @since 2021/8/4 19:16
 */
public class Test {

    public static int singleNumber(int[] nums) {

        Arrays.sort(nums);

        for (int i = 0; i < nums.length-1; i=i+2) {
            if(nums[i]!=nums[i+1]){
                return nums[i];
            }
        }
        return nums[nums.length-1];
    }

    public static int maxNumber(int[] nums) {
        Arrays.sort(nums);
        //次数
        int max=0;
        int b=0;
        //值
        int num = nums[0];

        for (int i = 1; i < nums.length-1;i++) {
            b++;
            if(num!=nums[i]&&max<=b) {
                    max=b;
                    num=nums[i-1];
            }
        }
        return num;
    }

    public static int findMax(int[] arr) {

        int x = 0;

        int veotr = 0;

        for (int num : arr) {
            if (veotr == 0) {
                x = num;
            }

            veotr += num == x ? 1: -1;
        }

        return x;
    }


    public static void main(String[] args) {
        int[] nums={1,2,3,4,4,2,3,5,1,6,5,5,6,6,6,1,1,1};
        System.out.println(singleNumber(nums));
        System.out.println(maxNumber(nums));
        System.out.println(findMax(nums));
    }
}
