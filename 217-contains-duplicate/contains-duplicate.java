class Solution {
    public boolean containsDuplicate(int[] nums) {
       HashSet<Integer> set = new HashSet<>();

       for (int num : nums) {
            if (!set.add(num)) { // if no. is not present then add and return true else false
            return true;
            }
        }
        return false;
    }
}