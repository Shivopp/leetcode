class Solution {
    public int maximumLengthSubstring(String s) {
        int max=0;
    int n=s.length();
        for(int i=0;i<n-1;i++){
            int current=0;
            int[] hash=new int[26];
            for(int j=i;j<n;j++){
                hash[s.charAt(j)-'a']++;
                boolean flag=true;
                 for(int k=0;k<26;k++){
                if(hash[k]>2){
                    flag=false;
                    break;
                }
                
            }
            if(flag){
                current=j-i+1;
                max=Math.max(current,max);
            }
            
            }
           
        }
    return max;
    }
}