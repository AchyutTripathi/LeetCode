class Solution {
    private TreeNode prev = null;

    public boolean isValidBST(TreeNode root) {
        return inOrder(root);
    }

    private boolean inOrder(TreeNode node) {
        if (node == null) {
            return true;
        }

        if (!inOrder(node.left)) {
            return false;
        }

        if (prev != null && node.val <= prev.val) {
            return false;
        }

        prev = node;

        return inOrder(node.right);
    }
}
