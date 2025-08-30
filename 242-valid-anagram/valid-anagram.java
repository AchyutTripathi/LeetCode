class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] temp1 = s.toCharArray();
        char[] temp2 = t.toCharArray();
        Arrays.sort(temp1);
        Arrays.sort(temp2);

        // using function .equals()
        //return Arrays.equals(temp1, temp2);


        // using for loop
        for (int i = 0; i < temp1.length; i++) {
            if (temp1[i] != temp2[i]) {
                return false;
            }
        }
        return true;
    }
}