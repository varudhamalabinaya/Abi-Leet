class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        List<Integer> sorted = new ArrayList<>();
        for(int num:set){
            sorted.add(num);
        }
        Collections.sort(sorted);
        
            if(sorted.size()>=3){
                return sorted.get(sorted.size()-3);
            }else{
                return sorted.get(sorted.size()-1);
            }
        
    }
}