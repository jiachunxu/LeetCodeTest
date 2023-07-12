package com0027j;

/**
 * @author JCX
 * 时间: 2021/10/4 - 10 - 04 - 20:51
 * 27. 移除元素
 * https://leetcode-cn.com/problems/remove-element/
 */
public class Test27 {
    public static void main(String[] args) {
        Solution ss = new Solution();
        //[3,2,2,3] 3
        int[] nums = {3,2,2,3};
        int val = 1;
        System.out.println(ss.removeElement(nums, val));
    }
}

class Solution {
    public int removeElement(int[] nums, int val) {
        if ((nums == null) || (nums.length == 0)) {
            return 0;
        }
        int[] shu = nums.clone();
        int count = 0;
        for (int i = 0; i < shu.length; i++) {
            if (val != nums[i]) {
                nums[count] = shu[i];
                count++;
            }

        }
//


            return count ;


    }
}
