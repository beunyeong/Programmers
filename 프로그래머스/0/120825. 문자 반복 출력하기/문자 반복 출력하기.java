class Solution {
    public String solution(String my_string, int n) {
        
        // StringBuilder를 사용한 객체 생성
        StringBuilder answer = new StringBuilder();
        
        // my_string.length 길이만큼 반복
        for(int i = 0; i < my_string.length(); i++) {
            
        // 현재 문자 가져오기
            char ch = my_string.charAt(i);
        
            // 현재 문자를 n만큼 반복 후 추가
            // .append(): 추가, .repeat(): 반복
            // String.valueOf(ch): 문자를 문자열로 변환
            answer.append(String.valueOf(ch).repeat(n));

        }
                
        // 최종 문자열 반환
        return answer.toString();
    }
}