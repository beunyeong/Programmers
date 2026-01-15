import java.util.*;

public class Solution {
    public int solution(int n) {
        
        int answer = 0;
        
        while(n > 0) {
            answer += n % 10;       // 맨 뒤 숫자 가져오기
            n /= 10;                // 맨 뒤 숫자 제거
        }

        return answer;
    }
}