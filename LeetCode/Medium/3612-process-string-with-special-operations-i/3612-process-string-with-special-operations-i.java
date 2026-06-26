class Solution {
    public String processStr(String s) {

        StringBuilder ab=new StringBuilder();
   

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                ab.append(s.charAt(i));
                
            }
            else if(s.charAt(i)=='*' ){
                if(ab.length()!=0){
                ab.deleteCharAt(ab.length()-1);
                
                }
                
            }
            else if(s.charAt(i)=='#'){
                ab.append(ab);
              
            }
            else{
                ab.reverse();
            }


        }
        return ab.toString();
        
    }
}