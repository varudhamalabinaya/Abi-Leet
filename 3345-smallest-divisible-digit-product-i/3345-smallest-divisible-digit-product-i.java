class Solution {
    public int smallestNumber(int n, int t) {
        while(true){
            int org=n;
            int res=1;
            while(org>0){
                int dig=org%10;
                res*=dig;
                org/=10;
            }
            if(res%t==0){
                return n;
              //  break;
            }
            else{
                n++;
            }
        }
    }
}