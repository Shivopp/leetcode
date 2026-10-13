
import java.util.Arrays;

class Solution {
    public long maxAlternatingSum(int[] arr) {

        int[] nums=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            nums[i]=Math.abs(arr[i]);
        }


        Arrays.sort(nums);

        int left = 0;
        int right = nums.length - 1;
        long ans = 0;

        while (left < right) {
            ans += (long) nums[right] * nums[right];
            ans -= (long) nums[left] * nums[left];

            left++;
            right--;
        }

        if (left == right) {
            ans += (long) nums[left] * nums[left];
        }

        return ans;
    }
}
