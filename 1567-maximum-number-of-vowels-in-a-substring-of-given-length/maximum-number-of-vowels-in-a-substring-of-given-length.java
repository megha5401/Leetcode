class Solution {
    //megha0
    public int maxVowels(String s, int k) {
        int c = 0;
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        for (int i = 0; i < k; i++) {
            if (vowels.contains(s.charAt(i))) {
                c++;
            }
        }
        int max = c;
        for (int i = k; i < s.length(); i++) {
            if (vowels.contains(s.charAt(i))) {
                c++;
            }
            if (vowels.contains(s.charAt(i-k))) {
                c--;
            }
            max = Math.max(c, max);
            if (max == k) {
                return max;
            }
        }
        return max;
    }
} 