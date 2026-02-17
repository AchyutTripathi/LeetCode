class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> map1 = new HashMap();
        HashMap<Character, Integer> map2 = new HashMap();
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }
        int left = 0;
        for (int r = 0; r < s2.length(); r++) {
            char ch = s2.charAt(r);
            map2.put(ch, map2.getOrDefault(ch, 0) + 1);

            if (r - left + 1 > s1.length()) {
                char leftChar = s2.charAt(left);
                map2.put(leftChar, map2.get(leftChar) - 1);

                if (map2.get(leftChar) == 0) {
                    map2.remove(leftChar);
                }
            left++;
            }   
        if (map1.equals(map2)) {
            return true;
            }
        }
        return false;
    }
}