class Solution {
    public int mostFrequentEven(int[] nums) {
        int n=nums.length;
        int even=0;
        int[] hash=new int[100001];
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                hash[nums[i]]++;
            even++;
            }
        }
        if(even==0){
            return -1;
        }
        int max=0;
        int ans=-1;
        for(int i=0;i<hash.length;i++){
             if(hash[i] > max) {
                max = hash[i];
                ans = i;
            }
        }
        
        return ans;
    }
}