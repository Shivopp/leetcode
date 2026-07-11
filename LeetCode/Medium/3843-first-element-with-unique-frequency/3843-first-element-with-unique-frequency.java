class Solution {
    public int firstUniqueFreq(int[] nums) {

    int[] freq=new int[100001];

    for(int i=0;i<nums.length;i++){
        freq[nums[i]]++;
    }
    int[] freq1=new int[100001];

    for(int i=0;i<freq1.length;i++){
        freq1[freq[i]]++;
    }

    for(int i=0;i<nums.length;i++){

        if(freq1[freq[nums[i]]]==1){
            return nums[i];
        }


    }
return -1;



        
    }
}