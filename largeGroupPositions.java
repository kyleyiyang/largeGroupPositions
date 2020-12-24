class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> lst = new ArrayList<>();
        for (int i=0;i<s.length();i++) {
            List<Integer> arr = new ArrayList<>();
            int j = i+1;
            int n = 1;
            while (j<s.length() && s.charAt(i) == s.charAt(j)) {
                j++;
                n++;
            }
            if (n>=3) {
                arr.add(i);
                arr.add(j-1);
                lst.add(arr);
            }
            i=j-1;
        }
        return lst;
    }
}
