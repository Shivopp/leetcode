class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {

        int[] hash=new int[101];
        for(int i=0;i<bulbs.size();i++){
            hash[bulbs.get(i)]++;
        }

        ArrayList<Integer> list=new ArrayList<>();

        for(int i=0;i<hash.length;i++){
            if(hash[i]%2!=0){
                list.add(i);
            }
        }
        return list;
    }
}