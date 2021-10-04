package com0028j;

/**
 * @author JCX
 * 时间: 2021/10/4 - 10 - 04 - 22:01
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
//        int h = haystack.length();
//        int n = needle.length();
//        if (n == 0) {
//            return 0;
//        } else {
//            if (h == 0) {
//                return 0;
//            } else {
//
//
//            }
//        }










        return haystack.indexOf(needle);



    }


}
