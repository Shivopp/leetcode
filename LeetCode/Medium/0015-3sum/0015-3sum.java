class Solution {


    public List<List<Integer>> threeSum(int[] arr) {
      
      int n=arr.length;
      Arrays.sort(arr);

     List<List<Integer>> ans = new ArrayList<>();

      for(int i=0;i<=n-3;i++){
        if(i>0 && arr[i]==arr[i-1]){
            continue;
        }
        int target=-arr[i];

       int left=i+1;
       int right=n-1;

       while(left<right){
       
        if(arr[left]+arr[right]==target){

              while(left<right && arr[left]==arr[left+1]){
            left++;
        }
        while( left<right &&  arr[right]==arr[right-1]){
            right--;
        }
             
           ans.add(Arrays.asList(arr[i], arr[left], arr[right]));
            left++;
            right--;
          
        }
        else if(arr[left]+arr[right]>target){
            right--;
        }
        else{
            left++;
        }
       }

      }  

    return ans;

    }
}