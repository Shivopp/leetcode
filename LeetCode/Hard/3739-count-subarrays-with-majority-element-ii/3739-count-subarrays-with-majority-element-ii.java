class Solution {
    public long countMajoritySubarrays(int[] nums, int target) {

        HashMap<Long, Long> mp = new HashMap<>();

        long ans = 0;
        long prefix = 0;
        long validleft = 0;

        mp.put(0L, 1L);

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == target) {
                validleft += mp.getOrDefault(prefix, 0L);
                prefix++;
            } else {
                
                prefix--;
                validleft -= mp.getOrDefault(prefix, 0L);
            }

            mp.put(prefix, mp.getOrDefault(prefix, 0L) + 1);

            ans += validleft;
        }

        return ans;
    }
}