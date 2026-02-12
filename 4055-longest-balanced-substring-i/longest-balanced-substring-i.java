class Solution {
    public int longestBalanced(String s) {
        char[] arr = s.toCharArray(); 
        int n = arr.length;
        int len = 0;
        for (int i = 0; i < n; i++) {
            HashMap<Character, Integer> map = new HashMap<>();
            for (int j = i; j < n; j++) {
                map.put(arr[j], map.getOrDefault(arr[j], 0) + 1);
                boolean flag = true;
                int freq = -1;
                for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                    if (freq == -1) {
                        freq = entry.getValue();
                    } else if (entry.getValue() != freq) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    len = Math.max(len, j - i + 1);
                }
            }
        }
        return len;
    }
}