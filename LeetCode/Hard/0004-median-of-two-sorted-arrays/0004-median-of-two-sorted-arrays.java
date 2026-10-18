class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;

       int[] arr=new int[n+m];

      for(int i=0;i<n;i++){
        arr[i]=nums1[i];
      }
      for(int i=0;i<m;i++){
        arr[i+n]=nums2[i];
      }

    int size=m+n;
      Arrays.sort(arr);
    int mid=(size+1)/2;
      if(size%2!=0){
        
        return (double)arr[mid-1];
      }

      double ans=((double)arr[mid-1]+arr[mid])/2;
      return ans;
    }
}