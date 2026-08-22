class Solution {
    public boolean checkDivisibility(int n) {

        int tot=0;
        int sum=0;
        int prod=1;
        int temp=n;
        while(n>0){
            int dig=n%10;
            sum+=dig;
            prod*=dig;
            n/=10;
        }
        tot=sum+prod;
        if(temp%tot==0){
            return true;
        }
        return false;
    }
}