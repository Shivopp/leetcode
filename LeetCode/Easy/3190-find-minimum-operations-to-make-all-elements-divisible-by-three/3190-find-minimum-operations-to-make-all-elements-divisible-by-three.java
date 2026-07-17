class Solution {
    public int minimumOperations(int[] nums) {
        int ans = 0;

        for (int num : nums) {
            int rem = num % 3;
            ans += Math.min(rem, 3 - rem);
        }

        return ans;
    }
}