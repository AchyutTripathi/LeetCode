class Solution {
    public long sumAndMultiply(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        while (n != 0) {
            int rem = n % 10;
            if (rem != 0) {
                list.add(rem);
            }
            n = n / 10;
        }
        Collections.reverse(list);
        long sum = 0;
        long ans = 0;
        for (int a : list) {
            sum += a;
        }
        for (int i = 0; i <= list.size() - 1; i++) {
            ans = (ans * 10) + list.get(i);
        }
        return (ans * sum);
    }
}