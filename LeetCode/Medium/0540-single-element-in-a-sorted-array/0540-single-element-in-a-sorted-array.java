class Solution {
    public int singleNonDuplicate(int[] nums) {
    //      int[] hash = new int[100000];
    //     for (int i = 0; i < nums.length; i++) {
    //         hash[nums[i]] += 1;
    //     }
    //     int no=0;

    //     for(int i=0;i<hash.length;i++){
    //         if(hash[i]==1){
    //             no=i;
    //         }
    //     }
    // return no;

    // int ans=-1;
    // int n=nums.length;
    // if(n==1){
    //     return nums[0];
    // }
    // for(int i=0;i<n-1;i++){
    //     if(nums[i]==nums[i+1]){
    //         i++;
    //     }
    //     else{
    //         ans=nums[i];
    //         break;
    //     }

    // }
    // if(ans==-1){
    //     return nums[n-1];
    // }
    //     return ans;

    // binary method

    int n=nums.length;

    int left=0;
    int right=n-1;;
    if(n==1){
        return nums[0];
    }
    if(nums[0]!=nums[1]){
        return nums[0];
    }
    if(nums[n-2]!=nums[n-1]){
        return nums[n-1];
    }
   

    while(left<=right){
         int mid=left+(right-left)/2;
    if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1] ){
        return nums[mid];
    }       
    if((mid%2==1 && nums[mid]==nums[mid-1] )||(mid%2==0 && nums[mid+1]==nums[mid]) ){
        left=mid+1;
    }
    else{
        right=mid-1;
    }
    }
       return -1;
    }
     

}