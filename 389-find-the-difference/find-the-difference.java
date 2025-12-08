class Solution {
    public char findTheDifference(String s, String t) {

        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequencies in s
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Subtract frequencies using t
        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) - 1);

            // If count becomes negative, that is the extra character
            if (map.get(c) < 0) {
                return c;
            }
        }

        return ' '; // never reached
    }
}
