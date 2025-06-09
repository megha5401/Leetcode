class Solution {
    //megha0
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) { // Adjust the prefix until it matches the current string
                prefix = prefix.substring(0, prefix.length() - 1); // Shorten the prefix
                if (prefix.isEmpty()) { // If the prefix becomes empty, return an empty string
                    return ""; 
                }
            }
        }
        return prefix;
    }
}