class Solution {
    public int alternateDigitSum(int n) {
        int sum = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        while (n != 0) {
            int rem = n % 10;
            arr.add(rem);
            n /= 10;
        }
        Collections.reverse(arr);
        for (int i = 0; i < arr.size(); i++) {
            if (i % 2 == 0) {
                sum += arr.get(i);
            } else {
                sum -= arr.get(i);
            }
        }
        return sum;
    }
}