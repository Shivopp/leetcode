class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> mp=new HashMap();
        HashMap<Character,Integer> mp1=new HashMap();
    for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(!mp.containsKey(ch)){
            mp.put(ch,1);
        }
        else{
           int currentfeq=mp.get(ch);
           mp.put(ch,currentfeq+1);
        }
    }
    for(int i=0;i<t.length();i++){
        char ch=t.charAt(i);
        if(!mp1.containsKey(ch)){
            mp1.put(ch,1);
        }
        else{
           int currentfeq=mp1.get(ch);
           mp1.put(ch,currentfeq+1);
        }
    }
    return mp.equals(mp1);
    }
}