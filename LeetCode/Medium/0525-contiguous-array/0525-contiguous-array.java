class Solution {
    public int findMaxLength(int[] nums) {

 HashMap<Integer, Integer> map = new HashMap<>();
  map.put(0, -1);
    for(int i=0;i<nums.length;i++){
        if(nums[i]==0){
            nums[i]=-1;
        }
    }

    int prefixsum=0;
    int le=0;

    for(int i=0;i<nums.length;i++){
        if(nums[i]==1){
            prefixsum++;
        }
        else{
            prefixsum--;
        }
        
    if(map.containsKey(prefixsum)){
        le=Math.max(le,i-map.get(prefixsum));
    }
    else{
        map.put(prefixsum,i);
    }
    }


        return le;
    }
}