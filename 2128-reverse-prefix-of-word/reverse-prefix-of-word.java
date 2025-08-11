class Solution {
    public String reversePrefix(String word, char ch) {
        char[] chars = word.toCharArray();
        char temp;

        int j = word.indexOf(ch);

        for (int i = 0; i < j; i++){
            temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            j--;
        }
        return String.valueOf(chars);
    }
}