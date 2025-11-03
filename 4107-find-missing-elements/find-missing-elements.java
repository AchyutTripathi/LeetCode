class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        Arrays.sort(nums);
        int first = nums[0];
        int last = nums[nums.length - 1];
        for (int i = first; i <= last; i++) {
            if (!map.containsKey(i)) {
                list.add(i);
            }     
        }
        return list;
    }
}