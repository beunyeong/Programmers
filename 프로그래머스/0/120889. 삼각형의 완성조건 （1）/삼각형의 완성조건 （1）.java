import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        
        // 베열을 정렬하여 가장 긴 변 찾기
        Arrays.sort(sides);       
        
        // 가장 짧은 두 변의 합이 가장 긴 변보다 크면 삼각형 가능
        if(sides[0] + sides[1] > sides[2]) {
            return 1;
        } else {
            return 2;
        }
        
    }
}