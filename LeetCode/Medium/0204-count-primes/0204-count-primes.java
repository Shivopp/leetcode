class Solution {
    public int countPrimes(int n) {

        int count =0;
        if(n==0){
            return 0;
        }
        if(n==1){
            return 0;
        }
       
    int[] hash=new int[n+1];

        for(int i=0;i<n;i++){
            hash[i]=1;
        }
    
    for(int i=2;i*i<hash.length;i++){
        if(hash[i]==1){
        for(int j=i*i;j<=n;j+=i){
                hash[j]=0;
            }
        }

    }

    for(int i=2;i<n;i++){

        if(hash[i]==1){
            count++;
        }

    }
    return count;
    }
}