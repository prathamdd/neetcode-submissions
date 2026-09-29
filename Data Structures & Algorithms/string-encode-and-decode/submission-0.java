class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();
        for (String s: strs){
            encoded.append(s.length()); //append length
            encoded.append('#');
            encoded.append(s); //append string itself
        }
        return encoded.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;

        while (i < str.length()) {
            //finding the #
            int j = i; 
            while (str.charAt(j) != '#'){
                j++;
            }
            int length = Integer.parseInt(str.substring(i,j));
            int start = j +1;
            int end = start + length;
            result.add(str.substring(start, end));
            i = end;

        }
        return result;
    }
}
