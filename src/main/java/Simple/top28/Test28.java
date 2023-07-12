package Simple.top28;

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
//        int h = haystack.length(), n = needle.length();
//        for (int i = 0; i + n <= h; i++) {
//            boolean flag = true;
//
//            //遍历短字符串长度的次数
//            for (int j = 0; j < n; j++) {
//                if (haystack.charAt(i + j) != needle.charAt(j)) {
//                    flag = false;
//                    break;
//                }
//            }
//            if (flag) {
//                return i;
//            }
//        }
//        return -1;
//

                //(3)暴力匹配优化//提升12ms
        int h = haystack.length(), n = needle.length();

        if (n == 0) {
            return 0;
        } else {
            if (n > h) {//h == 0 || n > h   多余
                return -1;
            }
            //----------------------------
            int count = 0;
            for (int i = 0; i < h; i++) {
                if (needle.charAt(0) == haystack.charAt(i) && (i + n <= h)) {
                    count += 1;
                }
            }
            int[] tong = new int[count];
            int k = 0;
            for (int i = 0; i < h; i++) {
                if (needle.charAt(0) == haystack.charAt(i) && (i + n <= h)) {


                    tong[k] = i;
                    k++;

                }
            }
            //----------------

            for (int value : tong) {
                boolean flag = true;// 第二次匹配要初始化
                //次数
                for (int j = 0; j < n; j++) {

                    if (haystack.charAt(value + j) != needle.charAt(j)) {
                        flag = false;
                        break;

                    }


                }
                if (flag) {
                    return value;
                }

            }


        }


        return -1;






    }


}
