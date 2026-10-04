class Solution {
    public String frequencySort(String s) {

     
       
     int[][] arr = new int[62][2];

        for (char ch : s.toCharArray()) {

            int idx;
            if (ch >= 'a' && ch <= 'z')
                idx =ch-'a';
            else if(ch >='A'&&ch<= 'Z')
                idx = 26+ch-'A';
            else
                idx = 52 +ch -'0';
            arr[idx][0]=ch;
            arr[idx][1]++;
        }

     Arrays.sort(arr,(a,b) ->b[1]-a[1]);



      StringBuilder ans = new StringBuilder();

        for (int i = 0; i < 62; i++) {

            for (int j = 0; j < arr[i][1]; j++) {
                ans.append((char)arr[i][0]);
            }
        }

        return ans.toString();





    }
}