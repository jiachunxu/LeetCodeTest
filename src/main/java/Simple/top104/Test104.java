package Simple.top104;

/**
 * @author adminjia
 * <p>
 * 104. 二叉树的最大深度
 * <p>
 * https://leetcode.cn/problems/maximum-depth-of-binary-tree/
 */
public class Test104 {
}

class Solution {


    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int a = maxDepth(root.left);
        int b = maxDepth(root.right);

        return Math.max(a, b) + 1;

    }
}
