class Solution {
    public int lengthOfLastWord(String s) {
        int n=s.length();
        int c=0;
        int i=n-1;
        while(i>=0 && s.charAt(i)==' '){
            i--;

        }
        while(i>=0 && s.charAt(i)!=' '){
            c=c+1;
            i--;
        }

        
        return c;
        
    }
}