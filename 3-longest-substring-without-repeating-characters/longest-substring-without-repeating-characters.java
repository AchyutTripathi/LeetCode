class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int low = 0, res = 0;
        for (int high = 0; high < s.length(); high++) {
            // shrinking
            while(set.contains(s.charAt(high))) {
                set.remove(s.charAt(low));
                low++;
            }
            set.add(s.charAt(high));
            res = Math.max(res, high - low + 1);
        }
        return res;
    }
}









