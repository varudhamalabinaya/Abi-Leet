class Solution {
    public int maxProduct(int n) {
        int first=0;
        int second=0;
        while(n>0){
            int result=n%10;
            if(result>first){
                second=first;
                first=result;
            }else if(result>second){
                second=result;
               
            } n/=10;
        }return first*second;
    }
}