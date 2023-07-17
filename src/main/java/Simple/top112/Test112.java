package Simple.top112;

/**
 * @author adminjia
 * <p>
 * 112. 路径总和
 * <p>
 * https://leetcode.cn/problems/path-sum/
 */
public class Test112 {
    public static void main(String[] args) {


    }
}

class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return root.val == targetSum;
        }

        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }
}