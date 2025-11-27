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
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> list = new ArrayList();
        if (root == null) {
            return list;
        }
        dfs(root, "", list);
        return list;
    }
    static void dfs(TreeNode node, String path, List<String> list) {
        if (node == null) return;
        path = path + node.val;

        if (node.left == null && node.right == null) {
            list.add(path);
            return;
        }
        dfs(node.left, path + "->", list);
        dfs(node.right, path + "->", list);
    }
}