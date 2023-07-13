package Medium.top931;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Stream;

/**
 * @author adminjia
 * <p>
 * 931. 下降路径最小和
 * <p>
 * https://leetcode.cn/problems/minimum-falling-path-sum/
 */
public class Test931 {
    public static void main(String[] args) {
//        int[][] arr = {{2, 1, 3}, {6, 5, 4}, {7, 8, 9}};
        int[][] arr = {{17, 82}, {1, -44}};
        System.out.println(new Solution().minFallingPathSum(arr));

    }


}

class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int x = matrix.length;
        int[][] dp = new int[x][x];
        System.arraycopy(matrix[0], 0, dp[0], 0, x);
        for (int i = 1; i < x; i++) {
            for (int j = 0; j < x; j++) {
                Integer left = null;
                Integer right = null;
                int up = dp[i - 1][j];
                if (j - 1 >= 0) {
                    left = dp[i - 1][j - 1];
                }
                if (j + 1 < x) {
                    right = dp[i - 1][j + 1];
                }
                Integer integer = Stream.of(left, right, up)
                        .filter(Objects::nonNull)
                        .min(Integer::compare)
                        .get();
                dp[i][j] = integer + matrix[i][j];

            }

        }

        return Arrays.stream(dp[x - 1])
                .min()
                .orElse(0);
//                .getAsInt();
    }

}