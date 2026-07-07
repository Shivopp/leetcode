class Solution {
    public long sumAndMultiply(int n) {

        StringBuilder ab=new StringBuilder();

        String s=Integer.toString(n);

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='0'){
                ab.append(s.charAt(i));
            }
        }
    String ans=ab.toString();
      if (ab.length() == 0) {
            return 0;
        }
    long num=Long.parseLong(ans);

    long sum=0;
    long temp=num;
    while(temp>0){
        long digit=temp%10;
        sum+=digit;
        temp/=10;
    }
    long finall=(sum*num);
    return finall;
        
    }
}