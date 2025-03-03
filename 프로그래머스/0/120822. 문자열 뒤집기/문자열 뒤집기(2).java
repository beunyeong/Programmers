class Solution {
    public String solution(String my_string) {
        // 빈 문자열 초기화
        String answer = "";
                
        // 문자열 뒤집기
        for(int i = 0; i < my_string.length(); i++) {
            // 문자열.charAt(인덱스)로 문자열 하나씩 가져오기
            answer += my_string.charAt(my_string.length() - 1 - i);
        }
        
        return answer;
    }
}
