class Solution {
    public boolean validMountainArray(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            max = Math.max(max, i);
        }
        ArrayList<Integer> left = new ArrayList();
        ArrayList<Integer> right = new ArrayList();
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] == max) break;
            left.add(arr[i]);
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == max) break;
            right.add(arr[i]);
        }
        if (left.size() == 0 || right.size() == 0) {
            return false;
        }
        Collections.reverse(right);
        for (int i = 0; i < left.size() - 1; i++) {
            if (left.get(i) >= left.get(i + 1)) return false;
        }
        for (int i = 0; i < right.size() - 1; i++) {
            if (right.get(i) <= right.get(i + 1)) return false;
        }
        return true;
    }
}