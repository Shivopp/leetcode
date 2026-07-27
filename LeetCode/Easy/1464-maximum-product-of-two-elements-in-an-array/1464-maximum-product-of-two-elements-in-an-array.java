class Solution {
    public int maxProduct(int[] nums) {
        int max=0;
        int max1=0;
        int index1=0;
        int index2=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                index1=i;
            }
        }
        for(int j=0;j<nums.length;j++){
            if(j!=index1 && nums[j]>max1){
                max1=nums[j];
                index2=j;
            }
        }
        int ans=(max-1)*(max1-1);
        return ans;


    }
}