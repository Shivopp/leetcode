class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {

       Arrays.sort(arr);

       arr[0]=1;

       for(int i=0;i<arr.length-1;i++){
        if(arr[i+1]-arr[i]>=1){
            arr[i+1]=arr[i]+1;
        }
       }
    int max=0;

    for(int i=0;i<arr.length;i++){
        if(arr[i]>max){
            max=arr[i];
        }
    }

        return max;
    }
}