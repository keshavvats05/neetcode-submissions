class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> sameWords = new HashMap<>();
        for(int i=0; i<strs.length; i++){
            char[] charArray = strs[i].toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);
            if (sameWords.containsKey(sortedWord)){
                sameWords.get(sortedWord).add(strs[i]);
            }
            else{
                ArrayList<String> words = new ArrayList<>();
                words.add(strs[i]);
                sameWords.put(sortedWord,words);
            }
        }
        return new ArrayList<>(sameWords.values());
    }
}

