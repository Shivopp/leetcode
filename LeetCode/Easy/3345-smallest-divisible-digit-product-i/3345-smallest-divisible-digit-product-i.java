class Solution {
    public int smallestNumber(int n, int t) {
        
        boolean flag=true;
        while(flag){
            int temp=n;
             int prod=1;
            while(temp>0){
               
                int digit=temp%10;
                prod*=digit;
                temp/=10;

            }
            if(prod%t==0){
                return n;
            }
            else{
                n++;
            }
        }
        return -1;
    }
}