class Solution {
    public int pivotIndex(int[] nums) {

        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
    int leftsum=0;
    int rightsum=0;

        for(int i=0;i<nums.length;i++){
            leftsum+=nums[i];
            int left=leftsum-nums[i];
            rightsum=sum-leftsum;
            if(left==rightsum){
                return i;
            }
        }

    return -1;

        
    }
}