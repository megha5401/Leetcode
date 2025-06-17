class Solution {
    //megha0
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int l = 0;
        int r = 0;
        int length = 0;
        while (r < s.length()) {
            if (!set.contains(s.charAt(r))) {
                set.add(s.charAt(r));
                r++;
                length = Math.max(length, set.size());
            }
            else {
                set.remove(s.charAt(l));
                l++;
            }
        }
        return length;
    }
}