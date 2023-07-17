package Simple.top110;

/**
 * @author adminjia
 * <p>
 * 110. 平衡二叉树
 * <p>
 * https://leetcode.cn/problems/balanced-binary-tree/
 */
public class Test110 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode r1 = new TreeNode(9);
        TreeNode r2 = new TreeNode(20);
        TreeNode r3 = new TreeNode(15);
        TreeNode r4 = new TreeNode(7);
        root.left = r1;
        root.right = r2;
        r2.left = r3;
        r2.right = r4;

        System.out.println(new Solution().isBalanced(root));

    }
}

class Solution {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }

        return Math.abs(height(root.left) - height(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right);


    }

    private int height(TreeNode t) {
        if (t == null) {
            return 0;
        }
//        if (t.left == null && t.right == null) {
//            return 1;
//        }
//        if (t.left == null) {
//            return height(t.right) + 1;
//        }
//        if (t.right == null) {
//            return height(t.left) + 1;
//        }


        return Math.max(height(t.left), height(t.right)) + 1;
    }
}