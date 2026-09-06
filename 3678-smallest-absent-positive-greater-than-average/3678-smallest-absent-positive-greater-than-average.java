class Solution {
    public int smallestAbsent(int[] nums) {
        int sum = 0;

        for(int num : nums) {
            sum += num;
        }

        double avg = (double) sum / nums.length;

        HashSet<Integer> sb = new HashSet<>();

        for(int num : nums) {
            sb.add(num);
        }

        int candidate = Math.max(1, (int)Math.floor(avg) + 1);

        while(sb.contains(candidate)) {
            candidate++;
        }

        return candidate;
    }
}