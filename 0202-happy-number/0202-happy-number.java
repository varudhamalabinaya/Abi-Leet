class Solution {
    public boolean isHappy(int n) {
        if (n==1||n==7) return true;
        if(n<10) return false;
       // if (n==2) return false;
       while(n!=1&&n!=4){
        int sum=0;
        while(n>0){
            int a=n%10;
            sum += a*a;
            n=n/10;   
        }
        n=sum;

        }
        return n==1;
       
    }}