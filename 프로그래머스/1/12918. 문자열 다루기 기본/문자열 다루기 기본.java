/* 
- length(): 문자열의 길이

*/
class Solution {
    public boolean solution(String s) {
        
        if (s.length() != 4 && s.length() != 6) {
            
            return false;
        }
        
        try {
            Integer.parseInt(s);
            return true;
            
        } catch (NumberFormatException ex) {
            return false;
        }
    }
}