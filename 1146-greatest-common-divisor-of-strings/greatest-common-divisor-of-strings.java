class Solution {
    public String gcdOfStrings(String str1, String str2) {
       if (!(str1 + str2).equals(str2 + str1)) 
        return "";
       int n1 = str1.length();
       int n2 = str2.length();
       return str1.substring(0, gcd(n1, n2));
    }
    public int gcd(int n1, int n2) {
        if (n2 == 0)
        return n1;
        return gcd(n2, n1 % n2);
    }
}
