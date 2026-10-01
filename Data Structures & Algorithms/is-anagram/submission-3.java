class Solution {
    public boolean isAnagram(String s, String t) {
        //if two strings are not equal length
        if (s.length() != t.length()){
            return false;
        }
        int [] anagram = new int [26];
        for (int i =0; i < s.length(); i ++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

        anagram[sChar -'a']++;
        anagram[tChar - 'a']--;
        }
        
        for (int i =0; i < anagram.length; i++){
            if (anagram[i] != 0){
                return false;
            }
        }
        return true;

    }
}
