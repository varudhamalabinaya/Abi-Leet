class Solution {
    public boolean checkDivisibility(int n) {
        int og=n;
        int tot=0, sum=0, pro=1;
        while(n!=0){
            int digit=n%10;
            sum+=digit;
            pro*=digit;
            n=n/10;

        }
        tot=sum+pro;
        return og%tot==0;
    }
}