class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set=new HashSet<>();
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> result1=new HashSet<>();
        HashSet<Integer> result2=new HashSet<>();

        for(int num:nums1){
            set.add(num);
        }
        for(int num:nums2){
            set1.add(num);
        }
        for(int num: nums1){
            if(!set1.contains(num)){
                result1.add(num);
            }
        }
        for(int num: nums2){
            if(!set.contains(num)){
                result2.add(num);
            }
        }
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>(result1));
        ans.add(new ArrayList<>(result2));
        return ans;

    }
}