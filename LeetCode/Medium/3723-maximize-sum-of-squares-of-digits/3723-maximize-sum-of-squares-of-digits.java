class Solution {
    public String maxSumOfSquares(int num, int sum) {

        StringBuilder str=new StringBuilder();

        if(sum>9*num){
            return str.toString();
        }

        int ans=0;
    int temp=sum;
        while(temp>=9){
           str.append(9);
            temp-=9;
        }


        if (str.length() < num && temp > 0) {
            str.append(temp);
        }

        while(str.length()<num){
            str.append(0);
        }
  


        return str.toString();




        
    }
}