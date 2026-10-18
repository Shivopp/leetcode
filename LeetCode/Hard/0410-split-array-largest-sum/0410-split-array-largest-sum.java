class Solution {

    public static boolean canbemin(int[] arr,long mid,int k){
        
        long curr=0;
        int stu=1;
        
        for(int i=0;i<arr.length;i++){
            
            if(curr+arr[i]<=mid){
                curr+=arr[i];
                
            }else{
                curr=arr[i];
                stu++;
            }
            
        }
        return stu<=k;
          
    }
    
    public int splitArray(int[] arr, int k) {
          int n=arr.length;
      int max=0;
      long sum=0;
      if(n<k){
          return -1;
      }
      
      for(int i=0;i<n;i++){
          if(arr[i]>max){
              max=arr[i];
             
              
          }
           sum+=arr[i];
      }
      long low=max;
      long high=sum;
      long ans=max;
      while(low<=high){
          
      long mid=low+(high-low)/2;
          
          if(canbemin(arr,mid,k)){
              ans=mid;
              high=mid-1;
              
          }
          else{
             low=mid+1; 
          }
          
      }
      return (int)ans;
    }
}