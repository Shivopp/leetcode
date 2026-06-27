class Solution {
    public boolean rotateString(String s, String goal) {

        StringBuilder ab=new StringBuilder();
        ab.append(s);
        ab.append(ab);
        String num=ab.toString();
        return num.contains(goal);

    }
}