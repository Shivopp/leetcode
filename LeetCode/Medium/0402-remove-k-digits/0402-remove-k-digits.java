class Solution {
    public String removeKdigits(String num, int k) {

        Stack<Character> st=new Stack();

        for(char x: num.toCharArray() ){

            while(k>0 && !st.isEmpty() && st.peek()>x){
                st.pop();
                k--;
            }
            st.push(x);


        }

    while(k-->0){
        st.pop();
    }

    StringBuilder str=new StringBuilder();
    while(st.size()!=0){
        str.append(st.pop());
    }
    str=str.reverse();

    String ans=str.toString();
int index=0;
while(index<ans.length() && ans.charAt(index)=='0'){
    index++;
}

 String finall=ans.substring(index);

    if(finall.length()==0){
        return "0";
    }
    else{
        return finall;
    }
        
    }
}