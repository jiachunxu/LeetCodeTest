package com5j;

/**
 * @author JCX
 * 时间: 2021/10/2 - 10 - 02 - 19:44
 * 包名: com5j
 * 简单:14. 最长公共前缀
 */
public class Test05 {
    public static void main(String[] args) {
        //strs = ["flower","flow","flight"]
        //["dog","racecar","car"]
        //["ab", "a"]
        //["flower","flower","flower","flower"]
        //["a","b"]
        String[] strs = {"a","b"};
        Solution ss = new Solution();
        System.out.println(ss.longestCommonPrefix(strs));

    }
}

class Solution {
    public String longestCommonPrefix(String[] strs) {
        int min = strs[0].length();
        int dd = 0;
        int zz = 0;
        boolean flg = false;

        String tt = "";
        if (strs.length == 1) {
            return tt = strs[0];
        } else {
            for (int i = 1; i < strs.length; i++) {
                if (min > strs[i].length()) {
                    min = strs[i].length();
                    zz = i;
                }
            }
            MMM:
            for (int i = 0; i < min; i++) {
                for (int j = 0; j < strs.length; j++) {
                    if (strs[0].charAt(i) == strs[j].charAt(i)) {
                    } else {
                        flg = true;
                        dd = i;
                        break MMM;
                    }
                }


            }
            if (!flg) {
                tt = strs[zz];
            }else {
                if (dd == 0) {
                    //错误
//                    if (strs[zz].length() == 1) {
//                        tt = strs[zz];
//
//                    } else {
                        tt = "";
//                    }

                } else {
                    tt = strs[0].substring(0, dd);
                }

            }
            return tt;
        }
    }
}