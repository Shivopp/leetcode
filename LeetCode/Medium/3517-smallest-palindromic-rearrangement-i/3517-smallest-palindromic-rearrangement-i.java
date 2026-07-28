class Solution {
    public String smallestPalindrome(String s) {
        int[] hash=new int[26];

        int n=s.length();
        for(int i=0;i<n;i++){
            hash[s.charAt(i)-'a']++;
        }
        int start=0;
        int end=n-1;
    char[] ans=new char[n];
    for(int i=0;i<hash.length;i++){
        while(hash[i]>=2){
            ans[start]=(char)('a'+i);
            ans[end]=(char)('a'+i);
            start++;
            end--;     
            hash[i]-=2;
               }
    if(hash[i]==1){
        ans[n/2]=(char)(i+'a');
        
    }

    }
    return new String(ans);
        
    }
}