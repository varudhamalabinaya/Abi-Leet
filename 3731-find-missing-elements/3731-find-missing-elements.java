class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        HashSet<Integer>set=new HashSet<>();
        for(int n:nums){
            set.add(n);
            if(n<min){
                min=n;
            }
            if(n>max){
                max=n;
            }
        }
        List<Integer>ans=new ArrayList<>();
        for(int i= min+1;i<max;i++){
            if(!set.contains(i)){
                ans.add(i);
            }
        }
        return ans;
        
    }
}