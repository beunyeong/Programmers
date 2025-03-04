import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        
        // Arrays.copyOfRange(배열, start, end)는 end 인덱스를 포함하지 않으므로 num2 + 1를 사용하여 num2가 포함 될 수 있도록 설정
        return Arrays.copyOfRange(numbers, num1, num2 + 1);
        
    }
}