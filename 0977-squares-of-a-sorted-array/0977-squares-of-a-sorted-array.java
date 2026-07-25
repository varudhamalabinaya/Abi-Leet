class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int arr[]=new int[n];
       
        for(int i=0;i<n;i++){
            int sq=nums[i]*nums[i];
        arr[i]=sq;
        }
        Arrays.sort(arr);
        return arr;

    }
}