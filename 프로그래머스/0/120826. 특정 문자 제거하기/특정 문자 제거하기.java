class Solution {
    public String solution(String my_string, String letter) {
        // answer 빈 값 저장
        String answer = "";
        
        // 특정 문자(letter)를 빈 문자열로 변경
        answer = my_string.replace(letter, "");
        
        return answer;
    }
}