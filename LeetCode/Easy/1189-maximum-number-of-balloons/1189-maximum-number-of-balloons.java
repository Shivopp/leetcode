class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] hash=new int[26];
        for(int i=0;i<text.length();i++){
            hash[text.charAt(i)-'a']++;
        }
        int l=hash[11]/2;
        int o=hash[14]/2;
        int b=hash[1];
        int a=hash[0];
        int n=hash[13];

        int ans=Math.min(Math.min(Math.min(Math.min(l,o),b),a),n);

        return ans;



        
    }
}