class Solution {
    public boolean hasAlternatingBits(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        while (n > 0) {
            int rem = n % 2;
            n = n / 2;
            list.add(rem);
        }
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) == list.get(i + 1)) {
                return false;
            }
        }
        return true;
    }
}