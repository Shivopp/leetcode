class Solution {

    public int smallestIndex(int[] nums) {
        int ans=-1;

        for(int i=0;i<nums.length;i++){
            int digit=0;
           int n=nums[i];

            while(n>0){
                digit+=n%10;
                n/=10;
            }

            if(i==digit){
                ans=i;
                return ans;
            }

        }
    return -1;
        
    }
}