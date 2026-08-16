class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> distinctChars = new HashSet<>();
        int left = 0;
        int maxLen = 0;
        for (int right = 0; right<s.length(); right++){
            while (distinctChars.contains(s.charAt(right))){
                distinctChars.remove(s.charAt(left));
                left++;
            }
            distinctChars.add(s.charAt(right));
            maxLen = Math.max(maxLen,(right-left)+1);
        }
        return maxLen;
     }
}
