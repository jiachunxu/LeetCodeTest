package Simple.top14;

/**
 * @author JCX
 * 时间: 2021/10/2 - 10 - 02 - 19:44
 * <p>
 * 简单:14. 最长公共前缀
 *  https://leetcode-cn.com/problems/longest-common-prefix/
 */
public class Test14 {
    public static void main(String[] args) {
        //strs = ["flower","flow","flight"]
        //["dog","racecar","car"]
        //["ab", "a"]
        //["flower","flower","flower","flower"]
        //["a","b"]
        String[] strs = {"a"};
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

        String tt;
        if (strs.length == 1) {
            tt = strs[0];
        } else {
            for (int i = 1; i < strs.length; i++) {
                if (min > strs[i].length()) {
                    min = strs[i].length();
                    zz = i;
                }
            }
            MMM:
            for (int i = 0; i < min; i++) {
                for (String str : strs) {
                    if (strs[0].charAt(i) != str.charAt(i)) {
                        flg = true;
                        dd = i;
                        break MMM;
                    }
                }


            }
            if (!flg) {
                tt = strs[zz];
            } else {
                if (dd != 0) {
                    tt = strs[0].substring(0, dd);
                } else {

                    tt = "";

                }

            }


        }
        return tt;
    }
}