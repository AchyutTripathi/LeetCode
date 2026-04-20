class Solution {
    public int maxDistance(int[] colors) {
        int max = 0;
        int ans = 0;
        int count = 0;
        for (int i = 0; i < colors.length; i++){
            for (int j = i + 1; j < colors.length; j++) {
                if (colors[i] == colors[j]) {
                    continue;
                }
                if (colors[i] != colors[j]) {
                    ans = Math.abs(i - j);
                }
            }
            max = Math.max(max, ans);
        }
        return max;
    }
}