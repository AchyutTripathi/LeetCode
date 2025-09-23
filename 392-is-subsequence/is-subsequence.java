class Solution {
    public boolean isSubsequence(String s, String t) {
       int i = 0;
       int j = 0;
       int counter = 0;
       char[] c = s.toCharArray();
       char[] d = t.toCharArray();
       while (i < c.length && j < d.length) {
            if (c[i] == d[j]) {
                i++;
                j++;
                counter++;
            } else 
        j++;
       }
       if (counter == s.length()) {
            return true;
       } else {
            return false;
       }
    }
}