class Solution {
    public int compress(char[] chars) {
        int i = 0;
        int index = 0;
        int n = chars.length;
        while (i < n) {
            char current = chars[i];
            int count = 0;
            while (i < n && chars[i] == current) {
                count++;
                i++;
            }
            chars[index++] = current;
            if (count > 1) {
                String num = String.valueOf(count);
                for (char digit : num.toCharArray()) {
                    chars[index++] = digit;
                }
            }
        }
        return index;
    }
}