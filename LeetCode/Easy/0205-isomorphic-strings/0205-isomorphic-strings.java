class Solution {
    public boolean isIsomorphic(String s, String t) {
        
    
    HashMap<Character,Character> mp=new HashMap<>();
    HashMap<Character,Character> mp1=new HashMap<>();
    
    for(int i=0;i<s.length();i++){
        char ch1=s.charAt(i);
        char ch2=t.charAt(i);
     if(mp.containsKey(ch1)){
        if(mp.get(ch1)!=ch2){
            return false;
        }
     }
     else{
        mp.put(ch1,ch2);
     }
     if(mp1.containsKey(ch2)){
        if(mp1.get(ch2)!=ch1){
            return false;
        }
     }
     else{
        mp1.put(ch2,ch1);
     }

    }
    return true;

    }
}