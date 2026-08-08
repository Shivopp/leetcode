class Solution {

     static long gcd(long a, long b) {
    while (b != 0) {
        long temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}

    public long maxPairStrength(int[] nums) {
        long ans=0;
    int n=nums.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                long gcdd=gcd(nums[i],nums[j]);
            long curr=(1L*nums[i]*nums[j])/(gcdd*gcdd);
    ans=Math.max(ans,curr);
            }
        }
        return ans;
    }
}