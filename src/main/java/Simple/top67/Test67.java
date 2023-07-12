package Simple.top67;

/**
 * @author JCX
 * 时间: 2021/10/9 - 10 - 09 - 20:51
 * 67. 二进制求和
 * https://leetcode.cn/problems/add-binary/
 */
public class Test67 {
    public static void main(String[] args) {
        Solution ss = new Solution();
        String a = "11";
        String b = "11";
        System.out.println(ss.addBinary(a, b));
    }
}

class Solution {
    public String addBinary(String a, String b) {
        return method1(a, b);
    }

    public String method1(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        StringBuilder builder = new StringBuilder();

        while (i >= 0 || j >= 0 || carry != 0) {
            int m = i >= 0 ? a.charAt(i) - '0' : 0;
            int n = j >= 0 ? b.charAt(j) - '0' : 0;
            int sum = n + m + carry;
            carry = sum >= 2 ? 1 : 0;
            sum = sum >= 2 ? sum - 2 : sum;
            builder.append(sum);

            i--;
            j--;

        }

        return builder.reverse().toString();
    }


}