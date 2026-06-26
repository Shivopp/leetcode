class Solution {
    public int firstMissingPositive(int[] nums) {
        
        HashSet<Integer> set=new HashSet<>();

        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
    int start=1;
        for(int i=0;i<set.size();i++){
            if(!set.contains(start)){
                return start;
            }
            else{
                start++;
            }
        }


    return start;



    }
}