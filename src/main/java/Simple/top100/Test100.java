package Simple.top100;

/**
 * @author adminjia
 * <p>
 * 100. 相同的树
 * <p>
 * https://leetcode.cn/problems/same-tree/
 */
public class Test100 {
    public static void main(String[] args) {


    }
}

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        try {
            isSameNode(q, p);


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
        isSameNode(q.left, p.left);
        isSameNode(q.right, p.right);

    }

}