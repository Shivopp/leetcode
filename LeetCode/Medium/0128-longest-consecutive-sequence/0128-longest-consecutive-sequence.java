class Solution {
    public int longestConsecutive(int[] nums) {

        int n = nums.length;
        if (n == 0) {
            return 0;
        }

        int max = 0;

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            set.add(nums[i]);
        }

        Iterator<Integer> it = set.iterator();

        while (it.hasNext()) {
            int num = it.next();

            if (!set.contains(num - 1)) {
                int length = 1;
                int current = num;

                while (set.contains(current + 1)) {
                    current++;
                    length++;
                }

                max = Math.max(max, length);
            }
        }

        return max;
    }
}