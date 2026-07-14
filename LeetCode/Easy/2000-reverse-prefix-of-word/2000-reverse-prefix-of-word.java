class Solution {
    public String reversePrefix(String s, char ch) {

        StringBuilder ab=new StringBuilder();
        
        int index=-1;
        for(int i=0;i<s.length();i++){
            char sh=s.charAt(i);
            if(ch==sh){
                index=i;
                break;
            }
        }

        if(index==-1){
            return s;
        }
        for(int i=0;i<=index;i++){
            ab.append(s.charAt(i));
        }
        ab.reverse();
        for(int i=index+1;i<s.length();i++){
            ab.append(s.charAt(i));
        }
        String ans=ab.toString();
        return ans;

        
    }
}