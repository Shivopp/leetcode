class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int ans=0;
       
        for(int i=0;i<nums.length;i++){
           HashMap<Integer,Integer> mp=new HashMap<>();
            
           
            for(int j=i;j<nums.length;j++){
               
                
                if(!mp.containsKey(nums[j])){
                    mp.put(nums[j],1);
                } 
                else{
                    mp.put(nums[j],mp.get(nums[j])+1);
                }
              
                int len=j-i+1;
                if(!mp.containsKey(target)){
                    mp.put(target,0);
                }
                else if(mp.get(target)>len/2){
                    ans++;
                }
               
            }
            }
        

    return ans;
    }
}