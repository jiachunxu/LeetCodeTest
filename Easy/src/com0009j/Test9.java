package com0009j;

/**
 * @author JCX
 * 时间: 2021/10/1 - 10 - 01 - 15:51
 *
 * 简单:9. 回文数
 *  https://leetcode-cn.com/problems/palindrome-number/
 *
 */
public class Test9 {
    public static void main(String[] args) {

        Solution ss = new Solution();
        System.out.println(ss.isPalindrome(12321));

    }
}

class Solution {
    public boolean isPalindrome(int x) {
        /*
        利用了7.整数反转的偷懒办法
        */
        if (x < 0) {
            return false;
        } else {
            int dd = x;


            long res = 0;
            int temp;

            while (0 != x / 10) {

                temp = x % 10;
                res = res * 10 + temp;
                x = x / 10;

            }
            res = res * 10 + x;
            return dd == res;


        }

    }
}