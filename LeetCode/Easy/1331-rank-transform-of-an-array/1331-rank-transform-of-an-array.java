class Solution {
    public int[] arrayRankTransform(int[] arr) {

        int[] temp=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            temp[i]=arr[i];
        }

        Arrays.sort(temp);
        int[] ans=new int[arr.length];

        HashMap<Integer,Integer> mp=new HashMap<>();


    int idx=1;

        for(int i=0;i<temp.length;i++){
            if(!mp.containsKey(temp[i])){
            mp.put(temp[i],idx);
            idx++;
            }
           
        }

        for(int i=0;i<arr.length;i++){

            ans[i]=mp.get(arr[i]);

        }


        return ans;
    }
}