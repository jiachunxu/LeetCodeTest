package Simple.top69;

/**
 * @author JCX
 * 时间: 2021/10/10 - 10 - 10 - 19:36
 * 69. Sqrt(x)
 * https://leetcode-cn.com/problems/sqrtx/
 */
public class Test69 {
    public static void main(String[] args) {
        Solution ss = new Solution();
        System.out.println(Math.sqrt(45665));
        System.out.println(ss.mySqrt(2147395599));
    }
}

class Solution {
    public int mySqrt(int x) {
        int l = 0;
        int r = x;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (mid * mid <= x) {
                ans = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }
}