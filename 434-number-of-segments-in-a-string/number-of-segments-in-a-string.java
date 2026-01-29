class Solution {
    public int countSegments(String s) {
        if (s.length() == 0) return 0;
        ArrayList<String> list = new ArrayList<>();
        String[] arr = s.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].equals("")) {
                list.add(arr[i]);
            }
        }
        return list.size();
    }
}
