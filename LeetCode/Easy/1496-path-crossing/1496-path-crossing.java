class Solution {
    public boolean isPathCrossing(String path) {

        HashSet<String> set = new HashSet<>();
        int x =0;
        int y =0;
        set.add(x +"," + y);

        for(int i =0; i <path.length();i++) {

            if(path.charAt(i)=='N') {
                y++;
            }
            else if(path.charAt(i)=='S') {
                y--;
            }
            else if(path.charAt(i)== 'E') {
                x++;
            }
            else if(path.charAt(i) == 'W') {
                x--;
            }

            String coordinate = x + "," + y;

            if(set.contains(coordinate)) {
                return true;
            }
            set.add(coordinate);
        }
        return false;
    }
}