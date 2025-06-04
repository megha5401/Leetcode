class Solution {
    //megha0
    public String reverseVowels(String s) {
        char[] c = s.toCharArray();
        int start = 0 ;
        int end = s.length()-1;
        String isVowel = "aeiouAEIOU";

        while (start < end) {
            while (start < end && isVowel.indexOf(c[start]) == -1) {
                start++;
            }
            while (start < end && isVowel.indexOf(c[end]) == -1) {
                end--;
            }
            if (start < end) {
                char temp = c[start];
                c[start] = c[end];
                c[end] = temp;
                start++;
                end--;
            }
        }
        String ans = new String(c);
        return ans;
    }
}