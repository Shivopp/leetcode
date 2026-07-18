class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int a=nums[0];
        int b=nums[nums.length-1];

        int gcd=0;

    while(b!=0){
        int temp=b;
        b=a%b;
        a=temp;

              gcd=a;
    }


    return gcd;
        
    }
}