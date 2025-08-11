class Solution {
    public String reversePrefix(String word, char ch) {
        Stack<Character> Stack = new Stack<>();
        StringBuilder ans = new StringBuilder();
        boolean found = false;

        for (int i = 0; i < word.length(); i++) {
            Stack.push(word.charAt(i));
            if (word.charAt(i) == ch) {
                found = true;
                break;
            }
        }
        if (!found) {
            return word;
        }
        while (!Stack.isEmpty()) {
            ans.append(Stack.pop());
        }
        int startIndex = ans.length();
        ans.append(word.substring(startIndex));
        return ans.toString();   
    }
}