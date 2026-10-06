class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

       
        int[] hash1 =new int[20001];
        int[] hash2 = new int[20001];
        int n1=nums1.length;
        int n2=nums2.length;

        for(int i=0;i<n1;i++){
            hash1[nums1[i]+10000]++;
        }
        
        for(int i=0;i<n2;i++){
            hash2[nums2[i]+10000]++;
        }

            int count=0;

    for(int i=0;i<hash1.length;i++){
        if(hash1[i]>0 && hash2[i]>0){
            count+=Math.min(hash1[i],hash2[i]);
        }
    }
    int[] ans=new int[count];
    int index=0;

    for(int i=0;i<hash1.length;i++){
        int times=Math.min(hash1[i],hash2[i]);
       while(times-->0){
        ans[index++]=i-10000;
       }
    }
        return ans;
    }
}