class Solution {
    public int findNumbers(int[] nums) {
      int count=0;
      for(int n:nums)  {
        int digitcount=0;
        while(n!=0){
            n=n/10;
            digitcount++;
        }
        if(digitcount%2==0){
            count++;
        }
      }return count;
    }
}