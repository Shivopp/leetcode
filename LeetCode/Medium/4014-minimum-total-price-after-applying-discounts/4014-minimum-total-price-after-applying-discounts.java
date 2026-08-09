class Solution {
    public double minPrice(int[] prices, int[] discounts) {

    int n=prices.length;
    int m=discounts.length;
    Arrays.sort(prices);
    Arrays.sort(discounts);
    double ans=0;
   int index=m;

        for(int i=n-1;i>=0;i--){
            if(index>0){
                ans+=(prices[i]*(100-discounts[index-1]))/100.0;
                index--;
            }
            else{
                ans+=prices[i];
            }
        }

    
    return ans;
        
    }
}