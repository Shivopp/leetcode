class Solution {
    static void merge(int[] nums, int l ,int mid , int r){

        int n1=mid-l+1;
        int n2=r-mid;

        int[] left=new int[n1];
        int[] right=new int[n2];

        int i,j,k;
        for( i=0;i<n1;i++){
            left[i]=nums[l+i];

        }
        for( j=0;j<n2;j++){
            right[j]=nums[mid+1+j];
        }
        i=0;
        j=0;
        k=l;

        while(i<n1 && j<n2){
            if(left[i]<right[j]){
                nums[k++]=left[i];
                i++;
            }
            else{
                nums[k++]=right[j++];
            }
        }
    while(i<n1){
        nums[k++]=left[i++];
    }
    while(j<n2){
        nums[k++]=right[j++];
    }
    }

static void mergesort(int[] nums,int l ,int r){

    if(l==r){
        return;
    }
    int mid=(l+r)/2;

    mergesort(nums,l,mid);
    mergesort(nums,mid+1,r);

    merge(nums , l ,mid , r);

}

    public int[] sortArray(int[] nums) {
        int n=nums.length;

        mergesort(nums,0,n-1);
        return nums;
        
    }
}