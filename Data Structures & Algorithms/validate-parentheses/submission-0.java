class Solution {
    public boolean isValid(String s) {
     Stack<Character> p = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                 p.push(c);
                 } else {
                 if (p.isEmpty()) return false;          
                     char top = p.pop();
             char expected = (c == ')') ? '(' : (c == '}') ? '{' : '[';
             if (top != expected) return false;      
            }
        }
        return p.isEmpty();                            
    }
}