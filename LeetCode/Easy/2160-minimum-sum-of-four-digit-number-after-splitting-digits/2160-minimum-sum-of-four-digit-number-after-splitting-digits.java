class Solution {
    public int minimumSum(int num) {
        int[] arr=new int[4];
    int index=0;
        for(int i=0;i<4;i++){
            int numm=num%10;
            arr[i]=numm;
            num/=10;
        }
        Arrays.sort(arr);
        StringBuilder ab=new StringBuilder();
        StringBuilder cd=new StringBuilder();
        ab.append(arr[0]);
        ab.append(arr[2]);
        cd.append(arr[1]);
        cd.append(arr[3]);

     String a=ab.toString();
     
     String b=cd.toString();

     int x=Integer.parseInt(a);
     int y=Integer.parseInt(b);
    return x+y;
        
    }
}