package com0035j;

/**
 * @author JCX
 * 时间: 2021/10/5 - 10 - 05 - 11:46
 * 简单:35. 搜索插入位置
 * https://leetcode-cn.com/problems/search-insert-position/submissions/
 */
public class Test35 {

    public static void main(String[] args) {
        Solution ss = new Solution();

        //nums = [1,3,5,6], target = 5
        int[] nums = {1};
//        int[] nums = {1};
        int target = 2;

        System.out.println(ss.searchInsert(nums, target));
    }


}

class Solution {
    public int searchInsert(int[] nums, int target) {

        //(1)遍历判断
        for (int i = 0; i < nums.length; i++) {

            if (target == nums[i]) {
                return i;

            } else {


                if (target < nums[0]) {
                    return 0;
                } else if (target > nums[nums.length - 1]) {
                    return nums.length;
                } else {
                    if (target > nums[i] && target < nums[i + 1]) {
                        return i + 1;
                    }
                }

            }
        }

        return 0;


        //(2)



    }
}