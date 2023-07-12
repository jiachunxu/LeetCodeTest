package Simple.top58;

/**
 * @author JCX
 * 时间: 2021/10/7 - 10 - 07 - 12:48
 * 58. 最后一个单词的长度
 * https://leetcode-cn.com/problems/length-of-last-word/submissions/
 */
public class Test58 {
    public static void main(String[] args) {
        Solution ss = new Solution();
        String s = "";
        System.out.println(ss.lengthOfLastWord(s));
    }
}

class Solution {
    public int lengthOfLastWord(String s) {
        int len = 0;
        for (int i = s.length() - 1; i >= 0; i--) {

            if (s.charAt(i) != ' ') {

                len++;


            } else if (len != 0) {

                return len;
            }


        }
        return len;
    }
}