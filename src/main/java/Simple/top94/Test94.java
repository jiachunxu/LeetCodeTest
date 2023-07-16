package Simple.top94;

import java.util.ArrayList;
import java.util.List;

/**
 * @author adminjia
 * <p>
 * 94 二叉树中序遍历
 * <p>
 * https://leetcode.cn/problems/binary-tree-inorder-traversal/
 */
public class Test94 {
    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        TreeNode l1 = new TreeNode(2);
        TreeNode l2 = new TreeNode(3);
        root.right = l1;
        l1.left = l2;

        System.out.println(new Solution().inorderTraversal(root));

    }
}

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {


        ArrayList<Integer> integers = new ArrayList<>();

        inorderTraversal2(root, integers);


        return integers;
    }

    private void inorderTraversal2(TreeNode root, List<Integer> list) {

        if (root == null) {
            return;

        }
        inorderTraversal2(root.left, list);
        list.add(root.val);


        inorderTraversal2(root.right, list);


    }
}

