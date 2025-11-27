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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        dfs(root, 0, targetSum, list, new ArrayList<>());
        return list;
    }

    private void dfs(TreeNode node, int curSum, int targetSum, List<List<Integer>> list, List<Integer> curPath) {
        if (node == null) return;
        curSum += node.val;
        curPath.add(node.val);

        if (node.left == null && node.right == null && curSum == targetSum) {
            list.add(new ArrayList<>(curPath));
        }
        dfs(node.left, curSum, targetSum, list, curPath);
        dfs(node.right, curSum, targetSum, list, curPath);
        curPath.remove(curPath.size() - 1);
    }
}