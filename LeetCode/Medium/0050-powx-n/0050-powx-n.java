class Solution {
    public double myPow(double x, int n) {
        double ans=1;
         long num=n;
        if(num<0){
            x=1/x;
            num=-num;
        }
       
        while(num>0){
             if ((num & 1) == 1) {   
                ans *= x;
            }
            x*=x;
            num/=2;
        }
       return ans;
    }
}