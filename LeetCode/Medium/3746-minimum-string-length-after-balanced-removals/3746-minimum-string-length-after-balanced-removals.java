class Solution {
    public int minLengthAfterRemovals(String s) {
        Stack<Character> st=new Stack<>();
        st.push(s.charAt(0));

        for(int i=1;i<s.length();i++){
            if(st.size()>0){
            char curr=st.peek();
            st.push(s.charAt(i));
            if(curr!=st.peek()){
                st.pop();
                st.pop();
            }
            }
            else{
                st.push(s.charAt(i));
            }
        }
        return st.size();
    }
}