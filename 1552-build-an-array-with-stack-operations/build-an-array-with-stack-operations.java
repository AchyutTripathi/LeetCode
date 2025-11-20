class Solution {
    public List<String> buildArray(int[] target, int n) {
        ArrayList<String> list = new ArrayList();
        int i = 1;
        int idx = 0;
        while (true) {
            if (i == target[target.length - 1]) {
                list.add("Push");
                break;
            }
            if (i != target[idx]) {
                list.add("Push");
                list.add("Pop");
                i++;
            } else {
                list.add("Push");
                i++;
                idx++;
            }
        }
        return list;
    }
}