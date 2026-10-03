class Solution {
int[] arr;
   void prefixsum(int[] nums) {
     arr = new int[nums.length];

        int sum = nums[0];
        arr[0] = sum;

        for(int k = 1; k < nums.length; k++) {
            arr[k] = nums[k] + sum;
            sum = arr[k];
        }
    }

     int bs(int i,int k ,int[] nums){
        int l=0;
            int r=i;
            int result=0;
            int orgsum=0;

        while(l<=r){
            int mid=l+(r-l)/2;
            int count=i-mid+1;
       int winsum=count*nums[i];
       if(mid == 0)
               orgsum = arr[i];
            else
                orgsum = arr[i] - arr[mid - 1];
        int op=winsum-orgsum;
        if(op>k){
            l=mid+1;
        }
        else{
            result=mid;
            r=mid-1;
        }

        }
        return i-result+1;


     }

    public int maxFrequency(int[] nums, int k) {

        Arrays.sort(nums);
        int result=0;
        prefixsum(nums);
        
        for(int i=0;i<nums.length;i++){

            int freq=bs( i, k, nums);
            result=Math.max(result,freq);
            

        }
            
            


        return result;



    

    }


}