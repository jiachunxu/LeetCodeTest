package Simple.top1;

import java.util.Arrays;

/**
 * @author JCX
 * 时间: 2021/9/27 - 09 - 27 - 17:48
 * <p>
 * 简单 : 1. 两数之和
 * <p>
 * https://leetcode-cn.com/problems/two-sum/
 */
public class Test1 {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.twoSum(nums, target)));
    }

}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] dd = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            //int temp = target - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target) {
                    dd[0] = i;
                    dd[1] = j;


                }
            }

        }


        return dd;

    }
}