class Solution {

    private void inorder(TreeNode node, List<Integer> list) {
        if (node == null) return;
        inorder(node.left, list);
        list.add(node.val);
        inorder(node.right, list);
    }

    public int[] findMode(TreeNode root) {
        if (root == null) return new int[0];
        ArrayList<Integer> values = new ArrayList<>();
        inorder(root, values);

        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int x : values) {
            freqMap.put(x, freqMap.getOrDefault(x, 0) + 1);
        }

        int maxFreq = 0;
        for (int f : freqMap.values()) {
            maxFreq = Math.max(maxFreq, f);
        }

        ArrayList<Integer> modes = new ArrayList<>();
        for (Map.Entry<Integer, Integer> e : freqMap.entrySet()) {
            if (e.getValue() == maxFreq) {
                modes.add(e.getKey());
            }
        }

        int[] ans = new int[modes.size()];
        for (int i = 0; i < modes.size(); i++) {
            ans[i] = modes.get(i);
        }
        return ans;
    }
}
