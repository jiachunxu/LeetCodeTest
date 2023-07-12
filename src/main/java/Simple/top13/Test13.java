package Simple.top13;

/**
 * @author JCX
 * 时间: 2021/10/2 - 10 - 02 - 14:55
 * <p>
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
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };

    }
}