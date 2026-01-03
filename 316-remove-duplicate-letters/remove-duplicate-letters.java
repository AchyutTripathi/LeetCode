class Solution {
    public String removeDuplicateLetters(String s) {
        Stack<Character> stk = new Stack<>();
        int[] lastIndex = new int[26];
        boolean[] present = new boolean[26];
        for (int i = 0; i < s.length(); i++) {
            lastIndex[s.charAt(i) - 'a'] = i;
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (present[c - 'a']) continue;

            while (!stk.isEmpty() && stk.peek() > c && lastIndex[stk.peek() - 'a'] > i) {
                present[stk.pop() - 'a'] = false;
            }
            stk.push(c);
            present[c - 'a'] = true;
        }
        StringBuilder str = new StringBuilder();
        for (char c : stk) {
            str.append(c);
        }
        return str.toString();
    }
}