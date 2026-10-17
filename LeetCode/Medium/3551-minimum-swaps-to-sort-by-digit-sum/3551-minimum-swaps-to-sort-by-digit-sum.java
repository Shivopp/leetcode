import java.util.*;

class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        int[][] arr = new int[n][3];

        for (int i = 0; i < n; i++) {
            int temp = nums[i];
            int sum = 0;

            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }

            arr[i][0] = sum;
            arr[i][1] = nums[i];
            arr[i][2] = i;
        }

        Arrays.sort(arr, (a, b) -> {
            if (a[0] != b[0]) {
                return Integer.compare(a[0], b[0]);
            }
            return Integer.compare(a[1], b[1]);
        });

        // Map each number to its current index in nums
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(nums[i], i);
        }

        int swaps = 0;

        for (int i = 0; i < n; i++) {
            int target = arr[i][1];

            if (nums[i] != target) {
                int currIndex = map.get(target);
                int currValue = nums[i];
                nums[i] = target;
                nums[currIndex] = currValue;

                
                map.put(target, i);
                map.put(currValue, currIndex);

                swaps++;
            }
        }

        return swaps;
    }
}