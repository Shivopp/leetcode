class Solution {
    public boolean rotateString(String s, String goal) {

    int[] f=new int[26];
    for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        f[ch-'a']++;
    }
     int[] fr=new int[26];
    for(int i=0;i<goal.length();i++){
        char ch=goal.charAt(i);
        fr[ch-'a']++;
    }
    for(int i=0;i<26;i++){
        if(f[i]!=fr[i]){
            return false;
        }
    }
        return true;
    }
}