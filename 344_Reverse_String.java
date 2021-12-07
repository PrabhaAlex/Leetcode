class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        int j = 0, i = n-1;
        while(j < i){
            char temp = s[j];
            s[j] = s[i];
            s[i] = temp;
            j++; i--;
        }
    }
}
