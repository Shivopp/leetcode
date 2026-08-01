class Solution {
    public int largestInteger(int n, int s) {
        int num=(int)Math.pow(10,n)-1;

       boolean let=true;
       if(s==0){
        return 0;
       }
          
            while(let && num>0){
                int temp=num;
                  int sum=0;
            while(temp>0){
                int digit=temp%10;
                sum+=digit;
                temp/=10;
               
            }
            if(sum==s){
                let=false;
                return num;
            }
            else{
                num--;
            }
            
            }
    
        return -1;
    }
}