class Solution {
    public boolean isAnagram(String s, String t) {
            if (s.length() != t.length()){
                return false;
            }
        Map<Character, Integer> anagram = new HashMap<>();
        for (char c : s.toCharArray()) { 
            if (anagram.containsKey(c)) {
            anagram.put(c, anagram.get(c) + 1);
            } else {
            anagram.put(c, 1);            
            }
        }
        for (char c : t.toCharArray()) {
            if (!anagram.containsKey(c)) {
                return false;
            }

            if (anagram.get(c) == 0) {
                return false;
            }
        }
        return true;
    }
}