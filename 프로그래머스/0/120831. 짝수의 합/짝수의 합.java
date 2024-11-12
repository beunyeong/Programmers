class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // i는 2부터 시작, 2 <= 10, 2+2,4+2,6+2,,,
       for(int i = 2; i <= n; i+=2) {
           answer += i;

       }
        
        return answer;
    }
}