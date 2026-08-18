class Solution {
    public int largestInteger(int[] nums, int k) {
    int n=nums.length;
    

        if(k==n){
            int max=-1;
            for(int i=0;i<n;i++){
                if(nums[i]>max){
                    max=nums[i];
                }
            }
            return max;
        }
        if (k == 1) {
            int[] freq = new int[51];

            for (int num : nums) {
                freq[num]++;
            }
            int ans = -1;
            for (int i =0; i<= 50; i++) {
                if (freq[i] ==1){
                    ans = i;
                }
            }
            return ans;
        }
        else {
    int start = nums[0];
    int end = nums[n - 1];
    int f = 0;
    int l = 0;
    for (int i = 0; i < n; i++) {
        if (nums[i] == start) {
            f++;
        }
        if (nums[i] == end) {
            l++;
        }
    }
    int ans = -1;
    if (f ==1) {
        ans= Math.max(ans, start);
    }

    if (l==1) {
        ans = Math.max(ans, end);
    }
    return ans;
}
       
    }
}