class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i < j){
            char charI = Character.toLowerCase(s.charAt(i));
            char charJ = Character.toLowerCase(s.charAt(j));

            if (!Character.isLetterOrDigit(charI)){
                i++;
                continue;
            }
            if (!Character.isLetterOrDigit(charJ)){
                j--;
                continue;
            }

            if (charI != charJ){
                return false;
            }
            i++;
            j--;

        }
        return true;
    }
}
