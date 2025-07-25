/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> inorderList = new ArrayList<>();
        getInorder(root, inorderList);

        return buildBST(inorderList, 0, inorderList.size() - 1);
    }

    void getInorder(TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }

        getInorder(node.left, list);
        list.add(node.val);
        getInorder(node.right, list);
    }

    TreeNode buildBST(List<Integer> list, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = start + (end - start) / 2;
        TreeNode root = new TreeNode(list.get(mid));

        root.left = buildBST(list, start, mid - 1);
        root.right = buildBST(list, mid + 1, end);

        return root;
    }
}