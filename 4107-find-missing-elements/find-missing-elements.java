class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int n : nums) {
            map.put(n, 1);
            min = Math.min(min, n);
            max = Math.max(max, n);
        }

        for (int i = min; i <= max; i++) {
            if (!map.containsKey(i)) {
                list.add(i);
            }
        }

        return list;
    }
}
