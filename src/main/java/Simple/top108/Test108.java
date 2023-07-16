package Simple.top108;

/**
 * @author adminjia
 * <p>
 * 108. 将有序数组转换为二叉搜索树
 * <p>
 * https://leetcode.cn/problems/convert-sorted-array-to-binary-search-tree/
 */
public class Test108 {
}

class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {


        TreeNode root = sortedArrayToBST(nums, 0, nums.length - 1);
        return root;

    }

    private TreeNode sortedArrayToBST(int[] nums, int l, int r) {
        if (l > r) {
            return null;
        }
        int mid = (l + r) / 2;
        TreeNode treeNode = new TreeNode(nums[mid]);
        treeNode.left = sortedArrayToBST(nums, l, mid - 1);
        treeNode.right = sortedArrayToBST(nums, mid + 1, r);

        return treeNode;

    }
}