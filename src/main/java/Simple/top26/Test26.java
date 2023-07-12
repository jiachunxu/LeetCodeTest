package Simple.top26;

/**
 * @author JCX
 * 时间: 2021/10/4 - 10 - 04 - 20:19
 * <p>
 * 26. 删除有序数组中的重复项
 * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/
 */
public class Test26 {
    public static void main(String[] args) {
        // nums = [1,1,2]
        int[] nums = {1, 1, 2};
        Solution ss = new Solution();
        System.out.println(ss.removeDuplicates(nums));
    }
}

class Solution {
    public int removeDuplicates(int[] nums) {
        if ((nums == null) || (nums.length == 0)) {
            return 0;
        }
        int k = 1;
        int m = 0;
        while (k < nums.length) {
            if (nums[m] == nums[k]) {
                k++;

            } else {
                if (k - m > 1) {
                    nums[m + 1] = nums[k];
                }
                k++;
                m++;

            }
        }


        return m + 1;



    }
}