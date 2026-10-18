class Solution {
    public int mySqrt(int x) {
       if(x<2){
        return x;
       }
       long low=0;
       long high=x/2;
       int ans=0;

       while(low<=high){
        long mid=low+(high-low)/2;

        if((long)mid*mid==x){
            return (int)mid;
        }

    if((long)mid*mid>x){
        
        high=mid-1;
    }
    else{
        ans=(int)mid;
        low=mid+1;
    }

       }
       return ans;
    }
}