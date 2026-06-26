class Solution {
    public boolean checkGoodInteger(int n) {
        
        int sum=0;
        int sq=0;
    int temp=n;
        while(temp>0){
            int digit=temp%10;
            sum+=digit;
            sq+=digit*digit;
            temp/=10;
        }

if(sq-sum>=50){
    return true;
}
else{
    return false;
}

    }
}