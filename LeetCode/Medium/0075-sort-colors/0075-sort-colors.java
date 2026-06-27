class Solution {
    public void sortColors(int[] nums) {
        
        int[] hash=new int[4];
        for(int i=0;i<nums.length;i++){
            hash[nums[i]]++;

        }
        int[] ans=new int[nums.length];
    
    int index=0;
    for(int i=0;i<hash.length;i++){
        while(hash[i]!=0){
            nums[index]=i;
            index++;
            hash[i]--;
        }
    }
       

        
    }
}