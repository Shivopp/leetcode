class Solution {
    public boolean canJump(int[] nums) {

        int n=nums.length;
        int max=nums[0]; 
        for(int i=1;i<n;i++){
            if(i<=max){
                if(max < i + nums[i]) {
                    max = i + nums[i];
                }
            }
            else{
                return false;
            }

        }

    return true;

    }
}