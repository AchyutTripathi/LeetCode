class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }

        int longest = 0;
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            set.add(nums[i]);
        }

        // find longest sequence
        for (int it : set) {
            // if "it" is a starting number
            if (!set.contains(it - 1)) {
                // find consecutive number
                int current = 1;
                int x = it;
                while (set.contains(x + 1)) {
                    x = x + 1;
                    current += 1;
                }
                longest = Math.max (longest, current);
            }
        }
        return longest;
    }
}