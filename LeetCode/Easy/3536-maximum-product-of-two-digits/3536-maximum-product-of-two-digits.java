class Solution {
    public int maxProduct(int n) {

    int[] hash=new int[10];
    while(n>0){
        int digit=n%10;
        hash[digit]++;
        n/=10;


    }
    int ans=1;
    int count=0;
    for(int i=9;i>=0;i--){
        while(hash[i]!=0 && count<2){
            ans*=i;
            hash[i]--;
            count++;
        }

    }
    return ans;
        
    }
}