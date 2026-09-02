class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //creating final result. List<String>> is one group
        List <List<String>> result = new ArrayList<>();  
        //track whether string has already been used 
        boolean [] used = new boolean [strs.length];   
        for (int i = 0; i < strs.length; i ++){
            if (used[i]){
                continue; //go through first string and check if used
            }
            //create new empty anagram group
            List <String> group = new ArrayList<>();  
            group.add(strs[i]);
            used[i] = true;    
            for (int j = i + 1; j < strs.length; j++) { //compare current string with every string after it
                if (used[j]){
                    continue;
                }
            if (areAnagrams(strs[i], strs[j])){
                group.add(strs[j]);
                used[j] = true; //if j is anagram add to used
                }
            }
            result.add(group);
        }
        return result;
    }
    private boolean areAnagrams(String s1, String s2) { 
        //helper method
        if (s1.length() != s2.length()){
            return false;
        }
//convert both strings to char arrays as Arrays.sort() works on arrays
        char [] char1 = s1.toCharArray();
        char [] char2 = s2.toCharArray();

        Arrays.sort(char1);
        Arrays.sort(char2);

        return Arrays.equals(char1, char2);
    }
}
