class Solution {
    public void reverseString(char[] s) {
        
        int n=s.length;
        int l=0;
        int R=n-1;
        while(l<R){
            char temp=s[l];
            s[l]=s[R];
            s[R]=temp;
            l++;
            R--;
        }
    }
}