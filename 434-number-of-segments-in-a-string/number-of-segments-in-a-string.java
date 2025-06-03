class Solution {
    //megha0
    public int countSegments(String s) {
        if (s == null || s.trim().isEmpty()) return 0;
        String a [] = s.trim().split("\\s+");
        return a.length;
    }
}