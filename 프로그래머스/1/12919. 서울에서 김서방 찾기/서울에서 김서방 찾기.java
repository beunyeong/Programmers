class Solution {
    public String solution(String[] seoul) {
        // 반환할 문자열을 담을 변수 answer를 빈문자열로 초기화
        String answer = "";
        
        // seoul의 길이만큼 반복
        for(int i = 0; i < seoul.length; i++) {
            // seoul 배열의 i가 "Kim"과 동일하다면
            if(seoul[i].equals("Kim")) {
                
             // "김서방은 i에 있다" 형식의 문자열을 answer에 저장
               answer = "김서방은 " + i + "에 있다";
            
            // "Kim"을 찾았다면 반복문 종료
            break;
            }

        }
        
        // 결과값 반환
        return answer;
            
    }
}