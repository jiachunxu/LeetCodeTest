package Simple.top101;

/**
 * @author adminjia
 * <p>
 * 101. 对称二叉树
 * <p>
 * https://leetcode.cn/problems/symmetric-tree/
 */
public class Test101 {
}

class Solution {
    public boolean isSymmetric(TreeNode root) {
        try {
            isSameNode(root.left, root.right);
        } catch (Exception e) {
            return false;
        }


        return true;
    }

    private void isSameNode(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return;
        }
        if (q == null || p == null) {
            throw new RuntimeException();
        }
        if (q.val != p.val) {
            throw new RuntimeException();
        }
        isSameNode(q.left, p.right);
        isSameNode(q.right, p.left);

    }
}