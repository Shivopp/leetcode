class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int left=0;
        int right=n-1;

        int max=0;
        int current=0;

        while(left<right){
            current=Math.min(height[left],height[right])*(right-left);
            max=Math.max(current,max);
            if(height[right]>height[left]){
                left++;
            }
            else{
                right--;
            }
        }
        return max;
    }
}