class Solution {
    public int maxDistinct(String s) {
        int[] hash=new int[26];

        for(int i=0;i<s.length();i++){
            hash[s.charAt(i)-'a']++;
        }
    int count=0;
 
    for(int i=0;i<26;i++)
    if(hash[i]>=1){
        count++;
    }
    return count;
    }
}