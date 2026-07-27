class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
       Arrays.sort(nums) ;
       HashSet<Integer> set=new HashSet<>();
       for(int num:nums){
        set.add(num);
       }
       ArrayList<Integer> arr=new ArrayList<>();
       int ind=0;
       for(int i=1;i<=nums.length;i++){
        if(!set.contains(i))
        arr.add(i);
        ind++;
       }
       return arr;
    }
}