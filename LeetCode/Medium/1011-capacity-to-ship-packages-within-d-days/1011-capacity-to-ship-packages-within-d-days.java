class Solution {


    static boolean canweplace(int[] arr,int weight,int target){

        int curr=0;
        int days=1;

        for(int i=0;i<arr.length;i++){
          if(curr+arr[i]<=weight){
            curr+=arr[i];

          }
          else{
            curr=arr[i];
            days++;
          }
        }

    if(days<=target){
        return true;
    }
   
        return false;
    


    }


    public int shipWithinDays(int[] weights, int days) {

        int n=weights.length;
        
       
        int low=0;
        int high=0;
        for(int i=0;i<n;i++){
            low=Math.max(low,weights[i]);
            high+=weights[i];
        }
        
        int ans=high;

        while(low<=high){

            int mid=low+(high-low)/2;

            if(canweplace(weights,mid,days)){
                ans=mid;
                high=mid-1;;
                
            }
            else{
                low=mid+1;
            }



        }

        


    return ans;


        
    }
}