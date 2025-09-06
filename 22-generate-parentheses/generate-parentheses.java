class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        params(0, 0, "", n, ans);
        return ans;
    }

    private void params(int openP, int closeP, String str, int n, List<String> ans) {
        if (str.length() == n * 2) {
            ans.add(str);
            return;
        }

        if (openP < n) {
            params(openP + 1, closeP, str + "(", n, ans);
        }
        
        if (closeP < openP) {
            params(openP, closeP + 1, str + ")", n, ans);
        }
    }


}