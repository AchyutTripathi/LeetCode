class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int low = 0, maxLen = 0;
        for (int high = 0; high < fruits.length; high++) {
            map.put(fruits[high], map.getOrDefault(fruits[high], 0) + 1);
            // shrinking
            while(map.size() > 2) {
                int leftFruit = fruits[low];
                map.put(leftFruit, map.get(leftFruit) - 1);
                if (map.get(leftFruit) == 0) {
                    map.remove(leftFruit);
                }
                low++;
            }
            maxLen = Math.max(maxLen, high - low + 1);
        }
        return maxLen;
    }
}
