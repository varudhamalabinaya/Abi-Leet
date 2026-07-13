class Solution {
    public void moveZeroes(int[] nums) {
        int m= nums.length;
        int c=0;
        for(int i=0;i<m;i++){
            if(nums[i]!=0){
            nums[c]=nums[i];
            c++;
            }
        }
        for(int i=c;i<m;i++){
            nums[i]=0;
        }
        for(int i=0;i<m;i++){
            System.out.print(nums[i]);
        }
    }
}