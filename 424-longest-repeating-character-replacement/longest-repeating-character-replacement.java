class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int low = 0, maxCnt = 0, res = Integer.MIN_VALUE;
        for (int high = 0; high < s.length(); high++) {
            char c = s.charAt(high);
            freq[c - 'A']++;
            maxCnt = Math.max(maxCnt, freq[c - 'A']);
            int len = high - low + 1;
            int diff = len - maxCnt;
            while (diff > k) {
                freq[s.charAt(low) - 'A']--;
                low++;
                len = high - low + 1;
                diff = len - maxCnt;
            }
            res = Math.max(res, len);
        }
        return res;
    }
}