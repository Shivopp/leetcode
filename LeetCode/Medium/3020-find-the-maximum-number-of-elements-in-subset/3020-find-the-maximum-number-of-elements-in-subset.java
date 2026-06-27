class Solution {
    public int maximumLength(int[] nums) {

        HashMap<Integer,Integer> mp=new HashMap<>();
        Arrays.sort(nums);

        for(int i=0;i<nums.length;i++){
            if(!mp.containsKey(nums[i])){
                mp.put(nums[i],1);
            }
            else{
                mp.put(nums[i],mp.get(nums[i])+1);
            }
        }
    int ans=0;
        int one = mp.getOrDefault(1, 0);
        if(one%2!=0){
            ans=one;
        }
        else{
            ans=one-1;
        }
        
    for (int start : mp.keySet()) {

    if (start == 1) continue;

    int length = 1;
    long mid = start;

    while (true) {

        if (!mp.containsKey((int) mid)) {
            break;
        }

        if (mp.get((int) mid) <= 1) {
            break;
        }

        long sq = mid * mid;

        if (!mp.containsKey((int) sq)) {
            break;
        }

        mid = sq;
        length += 2;
    }

    ans = Math.max(ans, length);
}
return ans;
        
    }
}