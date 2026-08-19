class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0,left=0,right=k;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        int maxSum=sum;
        while(right<nums.length){
            sum=sum-nums[left]+nums[right];
            left++;
            right++;
            maxSum=Math.max(maxSum,sum);
        }
        double avg=(double)maxSum/k;
        return avg;
    }
}