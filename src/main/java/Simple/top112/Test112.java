package Simple.top112;

/**
 * @author adminjia
 * <p>
 * 111. 二叉树的最小深度
 * <p>
 * https://leetcode.cn/problems/minimum-depth-of-binary-tree/
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