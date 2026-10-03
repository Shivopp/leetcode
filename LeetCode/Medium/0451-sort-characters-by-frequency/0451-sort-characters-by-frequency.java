class Solution {
    public String frequencySort(String s) {

        int[] hash = new int[128];

        for(int i = 0; i < s.length(); i++) {
            hash[s.charAt(i)]++;
        }

        StringBuilder ans = new StringBuilder();

        for(int freq = s.length(); freq > 0; freq--) {

            for(int i = 0; i < 128; i++) {

                if(hash[i] == freq) {

                    for(int j = 0; j < freq; j++) {
                        ans.append((char)i);
                    }
                }
            }
        }

        return ans.toString();
    }
}