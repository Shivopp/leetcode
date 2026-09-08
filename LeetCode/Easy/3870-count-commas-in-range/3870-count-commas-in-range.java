class Solution {
    public int countCommas(int n) {

        if(n<1000){
            return 0;
        }
        else if( n>=1000 && n<=100000){
            int ans=n-999;
            return ans;
        }
        else{
           return 0;
        }
        
    }
}