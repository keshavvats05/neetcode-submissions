class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> freq = new HashMap<>();
        int left = 0;
        int res = 0;
        for (int right=0; right<s.length(); right++){
            char ch = s.charAt(right);
            if (freq.containsKey(ch)){
                freq.put(ch, freq.get(ch)+1);
            }
            else{
                freq.put(ch,1);
            }
            while ((right-left)+1 - Collections.max(freq.values()) > k){
                freq.put(s.charAt(left), freq.get(s.charAt(left))-1);
                left+=1;
            }
            res = Math.max(res, (right-left) + 1);
        }
        return res;
    }
}
