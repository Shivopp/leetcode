class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();

        Arrays.sort(nums);

        int n = nums.length;
        int start = nums[0];
        int end = nums[n - 1];

        int m = end - start + 1;
        int[] arr = new int[m];

       
        int index = 0;
        for (int i = start; i <= end; i++) {
            arr[index++] = i;
        }

        // Check each number in arr
        for (int i = 0; i < m; i++) {
            boolean found = false;

            for (int j = 0; j < n; j++) {
                if (arr[i] == nums[j]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                list.add(arr[i]);
            }
        }

        return list;
    }
}