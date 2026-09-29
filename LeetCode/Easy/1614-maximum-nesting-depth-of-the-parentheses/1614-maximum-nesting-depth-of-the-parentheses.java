class Solution {
    public int maxDepth(String s) {
        // int length=0;
        // int max=0;
        // Stack<Character> st=new Stack();

        // for(int i=0;i<s.length();i++){
        //     if(s.charAt(i)=='('){
        //         st.push(s.charAt(i));
        //         length++;
        //     }
        //     else if(s.charAt(i)==')'){
        //         st.pop();
        //         length--;
        //     }
        //     max=Math.max(length,max);
        // }
        // return max;

    int count=0;
    int max=0;
    for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(ch=='('){
            count++;
        }
        else if(ch==')'){
            count--;
        }
        max=Math.max(count,max);
    }
    return max;

    }
}