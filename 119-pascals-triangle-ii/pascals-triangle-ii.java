class Solution {
    //megha0
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans = new ArrayList<>();
        long c = 1;
        ans.add((int)c);
        for(int i = 1; i <= rowIndex; i++) {
            c = c * (rowIndex+1 - i) / i;
            ans.add((int)c);
        }
        return ans;
    }
}