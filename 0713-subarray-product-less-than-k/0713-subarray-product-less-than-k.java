class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int m=nums.length;
        int count=0;
        for(int i=0;i<m;i++){
            int pro=1;
         //   int count=0;
            for(int j=i;j<m;j++){
                pro=pro*nums[j];
                if(pro<k){
                    count++;
                }else{
                    break;
                }
            }
        }  
        return count; 
    }
}