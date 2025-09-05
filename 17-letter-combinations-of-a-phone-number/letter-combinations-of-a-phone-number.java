class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.isEmpty()) {
        return new ArrayList<>(); // return empty list if no digits
    }
    return mobilePad("", digits);
    }

    List<String> mobilePad(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '0'; // this will convert String into int (eg. '2' to 2)
        String[] mapping = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        List<String> ans = new ArrayList<>();
        String letters = mapping[digit];

        for (char ch : letters.toCharArray()) {
            ans.addAll(mobilePad(p + ch, up.substring(1)));
        }
        return ans;
    }
}