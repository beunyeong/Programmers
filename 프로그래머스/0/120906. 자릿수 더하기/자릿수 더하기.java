class Solution {
    public int solution(int n) {
        // 각 자리수를 더할 변수 초기화
        int answer = 0;
        
        // n이 0이 될 때까지 반복
        while(n > 0) {
            
            // 현재 숫자의 마지막 자리수를 answer에 더하기
            answer += n % 10;
            // 마지막 자리 숫자를 제거하여 다음 자리로 이동
            n /= 10;
        }

        // 최종적으로 모든 자리수를 더한 값 반환
        return answer;
    }
}