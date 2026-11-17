class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();
        int high = 0;
        for (int i : candies) {
            high = Math.max(high, i);
        }
        for (int i = 0; i <= candies.length - 1; i++) {
            if (high <= candies[i] + extraCandies) {
                ans.add(true);
            } else {
                ans.add(false);
            } 
        }
        return ans;
    }
}