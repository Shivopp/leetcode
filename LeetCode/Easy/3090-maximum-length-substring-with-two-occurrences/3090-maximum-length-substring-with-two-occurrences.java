class Solution {
    public int maximumLengthSubstring(String s) {
       
    int left=0;
   
    int length=0;
    int maxlen=0;
    int n=s.length();
    int[] hash=new int[26];

    for(int right=0;right<n;right++){
        hash[s.charAt(right)-'a']++;
        while(hash[s.charAt(right)-'a']>2){
            (hash[s.charAt(left)-'a'])--;
            left++;
        }
         length=Math.max(length,right-left+1);
       


    }    



return length;

    }
}