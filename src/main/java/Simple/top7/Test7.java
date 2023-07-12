package Simple;


/**
 * @author JCX
 * 时间: 2021/10/1 - 10 - 01 - 15:42
 * 简单 7. 整数反转
 *  https://leetcode-cn.com/problems/reverse-integer/
 *
 */
public class Test7 {
    public static void main(String[] args) {
        int x = 1534236469;
//        int x = 56446;
        Solution ss = new Solution();
        int xx = ss.reverse(x);
        System.out.println(xx);
    }
}
class Solution {
    public int reverse(int x) {
        long res = 0;
        int temp;
        if (x == 0) {
            return 0;
        } else {
            while (0 != x / 10) {

                temp = x % 10;
                res = res * 10 + temp;
                x = x / 10;

            }
            res = res * 10 + x;
            if ((res) > (Math.pow(2, 31)-1) || (res) < (-Math.pow(2, 31))) {
                return 0;
            } else {

                return (int) res ;
            }
//            return (int) res;

        }

    }
}