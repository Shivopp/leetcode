class Solution {
    public int nextGreaterElement(int num) {
       
        char[] digits=Integer.toString(num).toCharArray();

        int n=digits.length;
        int index=-1;

        for(int i=n-1;i>0;i--){
            if(digits[i]>digits[i-1]){
                index=i-1;
                break;
            }
        }
        if(index==-1){
            return -1;
        }
        for(int i=n-1;i>index;i--){
            if(digits[i]>digits[index]){
                char temp=digits[i];
                digits[i]=digits[index];
                digits[index]=temp;
                break;
            }
        }

        int left=index+1;
        int right=n-1;
        while(left<right){
            char temp=digits[left];
            digits[left]=digits[right];
            digits[right]=temp;
            left++;
            right--;

        }
    String ab="";
    for(int i=0;i<n;i++){
        ab+=digits[i];
    }
   long ans = Long.parseLong(ab);

      if (ans > Integer.MAX_VALUE)
    return -1;

      return (int) ans;
    
    }
}