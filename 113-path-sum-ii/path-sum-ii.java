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
        dfs(root, targetSum, 0, list, new ArrayList<>());
        return list;
    }
    private void dfs(TreeNode node, int targetSum, int curSum, List<List<Integer>> list, List<Integer> curPath) {
        if (node == null) return;
        curSum += node.val; 
        curPath.add(node.val);

        if (node.left == null && node.right == null && curSum == targetSum) {
            list.add(new ArrayList<>(curPath));
        }

        dfs(node.left, targetSum, curSum, list, curPath);
        dfs(node.right, targetSum, curSum, list, curPath);

        curPath.remove(curPath.size() - 1);
    }
}