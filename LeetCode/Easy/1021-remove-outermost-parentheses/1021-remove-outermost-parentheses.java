class Solution {
    public String removeOuterParentheses(String s) {

        StringBuilder str=new StringBuilder();
           int n=s.length();

    int count=0;
    int ans=0;
    int length=0;

    for(int i =0;i<n;i++){
        char ch=s.charAt(i);

        if(ch=='('){
            if(count==0){
                count++;
            }
            else{
                str.append(ch);
                count++;
            }
        }
        else if(ch==')'){
            if(count==1){
                count=0;
            }
            else{
          str.append(ch);
            count--;

            }

        }
        


    }
    return str.toString();
    
        
    }
}