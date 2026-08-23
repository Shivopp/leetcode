class Solution {
    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {
       
    int n=nums.length;
    Arrays.sort(nums);

   List<List<Integer>> list = new ArrayList<>();
    int prev=lower;
    for(int i=0;i<n;i++){
         
        if (nums[i] < lower) {
                continue;
            }

            if (nums[i] > upper) {
                break;
            }

    if(prev<nums[i]){
      list.add(Arrays.asList(prev,nums[i] - 1));
    }
    prev=nums[i]+1;

   

    }
     if (prev <= upper) {
            list.add(Arrays.asList(prev, upper));
        }

    return list;

    }
}