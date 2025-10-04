class Solution {
    int count = 0;
    String result = "";

    public String getHappyString(int n, int k) {
        backtrack(new StringBuilder(), n, k);
        return result;
    }

    void backtrack(StringBuilder current, int n, int k) {
        if (current.length() == n) {
            count++;
            if (count == k) {
                result = current.toString();
            }
            return; 
        }

        for (char ch = 'a'; ch <= 'c'; ch++) {
            if (current.length() > 0 && current.charAt(current.length() - 1) == ch) {
                continue;
            }
            current.append(ch);
            backtrack(current, n, k);
            if (!result.isEmpty()) return;
            current.deleteCharAt(current.length() - 1);
        }
    }
}