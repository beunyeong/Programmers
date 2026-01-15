import java.util.*;

public class Solution {
    public int solution(int n) {
        
        int answer = 0;
        
        // int n을 String으로 변환
        String str = String.valueOf(n);
        
        // 문자 '0' = 숫자 48
        for(int i = 0; i < str.length(); i++) {
            int digit = str.charAt(i) - '0';
            answer += digit;
        }

        return answer;
    }
}