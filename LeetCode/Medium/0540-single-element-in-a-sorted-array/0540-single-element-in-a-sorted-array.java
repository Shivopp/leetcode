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

    int ans=-1;
    int n=nums.length;
    if(n==1){
        return nums[0];
    }
    for(int i=0;i<n-1;i++){
        if(nums[i]==nums[i+1]){
            i++;
        }
        else{
            ans=nums[i];
            break;
        }

    }
    if(ans==-1){
        return nums[n-1];
    }
        return ans;
    }
}