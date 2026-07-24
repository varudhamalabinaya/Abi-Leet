class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set=new HashSet<>();
        HashSet<Integer> result=new HashSet<>();
        for(int num:nums1){
            set.add(num);
        }
        for(int num:nums2){
            if(set.contains(num)){
                result.add(num);
            }
        }
        int n=result.size();

        int ans[] =new int [n];
        int i=0;
        for(int num:result){
            ans[i]=num;
            i++;
        
        }
        return ans;
    }
}