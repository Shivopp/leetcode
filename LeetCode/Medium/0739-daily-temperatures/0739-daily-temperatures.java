class Solution {
    public int[] dailyTemperatures(int[] tem) {
      
        Stack<Integer> st=new Stack<>();
    int n=tem.length;
        int[] ans=new int[tem.length];
        int index=0;
        
        for(int i=n-1;i>=0;i--){

              while(!st.isEmpty() && tem[i]>=tem[st.peek()]){
                st.pop();
                 
            }
          
            if(st.isEmpty()){
                
                ans[i]=0;
                st.push(i);
                
            }
            else if(!st.isEmpty() && tem[i]<tem[st.peek()]){
                ans[i]=st.peek()-i;
                 st.push(i);
            }
          
            
        }
    return ans;


    }
}  