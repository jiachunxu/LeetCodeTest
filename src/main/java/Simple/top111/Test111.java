package Simple.top111;

/**
 * @author adminjia
 * <p>
 * 111. 二叉树的最小深度
 * <p>
 * https://leetcode.cn/problems/minimum-depth-of-binary-tree/
 */
public class Test111 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode r1 = new TreeNode(2);
        TreeNode r2 = new TreeNode(3);

        root.left = r1;
        root.right = r2;


        System.out.println(new Solution().minDepth(root));

    }
}

class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;

        }
        if (root.left == null && root.right == null) {
            return 1;
        }


        int l = height(root.left);
        int r = height(root.right);
        if (l == 0) {
            return r + 1;

        }
        if (r == 0) {
            return l + 1;
        }
        return Math.min(l, r) + 1;
    }

    private int height(TreeNode t) {
        if (t == null) {
            return 0;
        }

        int l = height(t.left);
        int r = height(t.right);
        if (l == 0) {
            return r + 1;

        }
        if (r == 0) {
            return l + 1;
        }
        return Math.min(l, r) + 1;
    }

}