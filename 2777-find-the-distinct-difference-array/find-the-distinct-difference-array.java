class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for (int i = 0; i < nums.length; i++) {
            int rind = i + 1;
            int lind = i;
            HashSet<Integer> set1 = new HashSet<>();
            HashSet<Integer> set2 = new HashSet<>();
            while (lind >= 0) {
                set1.add(nums[lind--]);
            }
            while (rind <= nums.length - 1) {
                set2.add(nums[rind++]);
            }
            ans[i] = set1.size() - set2.size();
        }
        return ans;
    }
}