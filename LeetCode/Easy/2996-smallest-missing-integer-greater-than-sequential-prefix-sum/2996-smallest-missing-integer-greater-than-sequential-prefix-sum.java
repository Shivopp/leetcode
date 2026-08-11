class Solution {
    public int missingInteger(int[] nums) {

        int n=nums.length;
    int sum=nums[0];
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]+1){
                sum+=nums[i];
            }
            else{
                break;
            }
        }

        int ans=0;
        boolean flag=true;
        while(flag){
             flag=false;
              for(int i=0;i<n;i++){
            if(nums[i]==sum){
                sum++;
                flag=true;
                break;
            }
       
        }
        }
      
return sum;
      
    }
} 