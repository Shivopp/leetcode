class Solution {
    public int[] resultArray(int[] nums) {

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();

        list.add(nums[0]);
        list1.add(nums[1]);

        for (int i = 2; i < nums.length; i++) {

            int last1 = list.get(list.size() - 1);
            int last2 = list1.get(list1.size() - 1);

            if (last1 > last2) {
                list.add(nums[i]);
            } else {
                list1.add(nums[i]);
            }
        }

        int[] ans = new int[nums.length];
        int index = 0;

        for (int i = 0; i < list.size(); i++) {
            ans[index] = list.get(i);
            index++;
        }

        for (int i = 0; i < list1.size(); i++) {
            ans[index] = list1.get(i);
            index++;
        }

        return ans;
    }
}