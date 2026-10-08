class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);

        int ans=0;
        int n=piles.length;

        int start=0;
        int end=n-1;
        while(start<end){
            ans+=piles[end-1];
            start++;
            end-=2;
        }

        return ans;
    }
}