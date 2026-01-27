class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> list = new ArrayList<>();
        int minDiff = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
           minDiff = Math.min(minDiff, arr[i + 1] - arr[i]); 
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] == minDiff) {
                list.add(Arrays.asList(arr[i], arr[i + 1]));
            }
        }
        return list;
    }
}
