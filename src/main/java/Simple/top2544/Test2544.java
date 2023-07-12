package Simple.top2544;


import java.util.Arrays;

/**
 * @author adminjia
 *
 * 2544. 交替数字和
 * https://leetcode.cn/problems/alternating-digit-sum/
 */
public class Test2544 {
    public static void main(String[] args) {
        int a = 454654;

        System.out.println(new Solution().alternateDigitSum(a));


    }

}

class Solution {
    public int alternateDigitSum(int n) {

        String str = "" + n;
        int length = str.length();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            int num = Integer.parseInt("" + str.charAt(i));

            if (i % 2 != 0) {
                num = -num;
            }
            arr[i] = num;


        }


        return Arrays.stream(arr).sum();

    }
}