class Solution {
    //megha0
    public String reverseWords(String s) {
      char[] ch = s.toCharArray();
      int n = s.length();
      reverse(ch, 0, n-1);
      reverseWord(ch, n);
      return cleanSpace(ch, n);

    }
    private void reverse(char[] ch, int i, int j){
        while (i < j) {
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++; j--;
        }
    }
     private void reverseWord(char[] ch, int n){
        int i = 0, j = 0;
        while (j < n) {
            while (j < n && ch[j] == ' ') j++;   // Skip spaces
            i = j;                            // Set i to the start of the word
            while (j < n && ch[j] != ' ') j++;   //j points to space next to end of a word
            reverse(ch, i, j-1);
        }
     }
     private String cleanSpace(char[] ch, int n){
        int i = 0, j = 0;
        while (j < n) {
            while (j < n && ch[j] == ' ') j++;
            while (j < n && ch[j] != ' ') ch[i++] = ch[j++];
            while (j < n && ch[j] == ' ') j++;
            if (j < n) ch[i++] = ' '; 
        }
          return new String(ch).substring(0,i);  
     }

    
}