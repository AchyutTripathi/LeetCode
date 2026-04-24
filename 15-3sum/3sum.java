class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int left = i + 1;
            int right = n - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum < 0) {
                    left++;
                } else if (sum > 0) {
                    right--;
                } else {
                    ArrayList<Integer> list2 = new ArrayList<>();
                    list2.add(nums[i]);
                    list2.add(nums[left]);
                    list2.add(nums[right]);
                    list.add(list2);
                    left++;
                    right--;

                    while (left < right && nums[left] == nums[left-1]) {
                        left++;
                    }
                }
            }
        }
        return list;
    }
}