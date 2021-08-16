package gpstudy.leetcode.arithmetic;

import java.util.Arrays;

public class Test27 {
    public static int removeElement(int[] nums, int val) {
        int length = nums.length;
        int cont=0;
        for (int i = 0; i < length; i++) {
            if(nums[i]!=val){
                    nums[cont]=nums[i];
                cont++;
            }
        }
        return cont;
    }

    public static void main(String[] args) {

        int[] ints = {1, 2, 3, 4, 4, 4, 2, 3, 3};
        System.out.println(removeElement(ints, 4));
        System.out.println(Arrays.toString(ints));
    }
}
