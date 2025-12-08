class Solution {
    public char findTheDifference(String s, String t) {
        char[] c = s.toCharArray();
        char[] d = t.toCharArray();
        Arrays.sort(c);
        Arrays.sort(d);
        for (int i = 0; i < c.length; i++) {
            if (c[i] != d[i]) {
                return d[i];
            }
        }
        return d[d.length - 1];
    }
}