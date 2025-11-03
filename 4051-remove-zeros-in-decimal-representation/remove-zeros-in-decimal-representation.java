class Solution {
    public long removeZeros(long n) {
        ArrayList<Long> list = new ArrayList<>();
        while (n > 0) {
            long rem = n % 10;
            if (rem != 0) {
                list.add(rem);
            }
            n = n / 10;
        }
        long num = 0;
        Collections.reverse(list);
        for (long element : list) {
            num = num * 10 + element; 
        }
        return num;
    }
}