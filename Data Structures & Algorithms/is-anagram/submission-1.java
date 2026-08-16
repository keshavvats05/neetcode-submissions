class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> sCount = new HashMap();
        HashMap<Character,Integer> tCount = new HashMap();
        for(int i=0; i<s.length(); i++){
            char charS= s.charAt(i);
            if (sCount.containsKey(charS)){
                sCount.put(charS, sCount.get(charS)+1);
            }
            else {
                sCount.put(charS, 1);
            }
        }
         for(int i=0; i<t.length(); i++){
            char charT = t.charAt(i);
            if (tCount.containsKey(charT)){
                tCount.put(charT, tCount.get(charT)+1);
            }
            else {
                tCount.put(charT, 1);
            }
        }       
        if (sCount.equals(tCount)){
            return true;
        }
        else{
            return false;
        }
    }
}
