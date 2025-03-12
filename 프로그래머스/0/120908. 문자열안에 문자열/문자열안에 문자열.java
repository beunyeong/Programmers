class Solution {
    public int solution(String str1, String str2) {
        
        // indexOf()가 -1이 아니라면 str2가 포함된 것이므로 1을 반환
        if(str1.indexOf(str2) != -1) {
            return 1;
        } else {
            return 2;
        }
    }
}