package gpstudy.leetcode.arithmetic;

import java.util.HashMap;
import java.util.Map;

/*给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。

你可以假设数组是非空的，并且给定的数组总是存在多数元素。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/majority-element
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/
public class T169 {
    public int majorityElement(int[] nums) {
        int length = nums.length;
        Map<Integer,Integer> map=new HashMap();
        for (int i=0;i<length;i++ ){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else {
                map.put(nums[i],1);
            }
        }
        return 1;
    }
}
