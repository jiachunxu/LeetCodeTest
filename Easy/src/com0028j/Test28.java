package com0028j;

/**
 * @author JCX
 * 时间: 2021/10/4 - 10 - 04 - 22:01
 * 简单 28 实现 strStr()
 * https://leetcode-cn.com/problems/implement-strstr/
 */
public class Test28 {
    public static void main(String[] args) {
        Solution ss = new Solution();
        //haystack = "hello", needle = "ll"
        //：haystack = "aaaaa", needle = "bba"
        //haystack = "", needle = ""
        String haystack = "hello";
        String needle = "ll";
        System.out.println(ss.strStr(haystack, needle));
    }
}

class Solution {
    public int strStr(String haystack, String needle) {


        //(1)调API
        //return haystack.indexOf(needle);


        //(2)暴力匹配
        int h = haystack.length(), n = needle.length();
        for (int i = 0; i + n <= h; i++) {
            boolean flag = true;

            //遍历短字符串长度的次数
            for (int j = 0; j < n; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return i;
            }
        }
        return -1;




    }


}
