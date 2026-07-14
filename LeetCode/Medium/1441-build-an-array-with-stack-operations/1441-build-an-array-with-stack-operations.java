class Solution {
    public List<String> buildArray(int[] target, int n) {

        Stack<Integer> st=new Stack<>();
        ArrayList<String> list=new ArrayList<>();
        int idx=0;

        for(int i=1;i<=n && idx<target.length;i++){
            st.push(i);
            list.add("Push");
            if(st.peek()==target[idx]){
                idx++;
            }
            else{
                list.add("Pop");
                st.pop();
            }
        }

        return list;
        
    }
}