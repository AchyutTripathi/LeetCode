class Solution {
    public int minSteps(String s, String t) {
        HashMap<Character, Integer> map1 = new  HashMap<>();
        HashMap<Character, Integer> map2 = new  HashMap<>();
        for (char ch : s.toCharArray()) {
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }
        for (char ch : t.toCharArray()) {
            map2.put(ch, map2.getOrDefault(ch, 0) + 1);
        }
        int ans = 0;
        for (char ch : map1.keySet()) {
            int count1 = map1.get(ch);
            int count2 = map2.getOrDefault(ch, 0);
            ans += Math.max(0, count1 - count2);
        }
        return ans;
    }
}