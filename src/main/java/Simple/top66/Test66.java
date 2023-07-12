package com0066j;

import java.util.Arrays;

/**
 * @author JCX
 * 时间: 2021/10/8 - 10 - 08 - 20:06
 * 66. 加一
 * https://leetcode-cn.com/problems/plus-one/
 */
public class Test66 {
    public static void main(String[] args) {
        Solution ss = new Solution();
        int[] digits={9,9,9};
        System.out.println(Arrays.toString(ss.plusOne(digits)));
    }
}
class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;

            } else {
                digits[i] += 1;
                return digits;
            }

        }
        digits = new int[digits.length + 1];
        digits[0] = 1;

        return digits;


    }
}

