class Solution {
    public int solution(int n) {
        // 약수 개수를 저장하는 변수
        int answer = 0;
        
        // 1부터 n까지 반복
        for(int i = 1; i <= n; i++) {
            
            // i가 n의 약수 구하기
            if(n % i == 0) {
                answer++;
                
            }
        }
        return answer;
    }
}