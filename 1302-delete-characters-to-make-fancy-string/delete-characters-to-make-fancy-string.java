class Solution {
    public String makeFancyString(String s) {
        StringBuilder res = new StringBuilder();
        for (char c : s.toCharArray()) {
            int last = res.length();
            if (res.length() >= 2 && res.charAt(last - 1) == c && res.charAt(last - 2) == c) {
                continue;
            }
            res.append(c);
        }
        return res.toString();
    }
}