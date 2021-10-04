package com0013j;

/**
 * @author JCX
 * 时间: 2021/10/2 - 10 - 02 - 14:55
 *
 * 简单:13. 罗马数字转整数
 *  https://leetcode-cn.com/problems/roman-to-integer/
 */
public class Test13 {


    public static void main(String[] args) {
//        String d = "III";
        String d = "LVIII";
        Solution s = new Solution();
        System.out.println(s.romanToInt(d));


    }
}

class Solution {
    public int romanToInt(String s) {
        int a = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (fanhui(s.charAt(i)) - fanhui(s.charAt(i + 1)) < 0) {
                a = a - fanhui(s.charAt(i));
            } else {
                a = a + fanhui(s.charAt(i));
            }


        }
        a = a + fanhui(s.charAt(s.length() - 1));


        return a;
    }

    public int fanhui(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;

            default:
                return 0;
        }

    }
}