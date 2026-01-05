import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        // commands.length 길이만큼 결과를 담을 배열
        int[] answer = new int[commands.length];
        
        // 반복문으로 배열 자르기
        for(int c = 0; c < commands.length; c++) {
            int i = commands[c][0];
            int j = commands[c][1];
            int k = commands[c][2];
        
        
        // 배열 자르기
        // array: 1, 5, 2, 6, 3, 7, 4
        // index: 0, 1, 2, 3, 4, 5, 6
                                            // 2부터 ~ 5까지 자르기
        // 결과: 5, 2, 6, 3
        int[] slicedArray = Arrays.copyOfRange(array, i-1, j);
        
        // 배열 오름차순 정렬하기
        // 결과: 2, 3, 5, 6
        Arrays.sort(slicedArray);
        
        // k: 3번째 숫자 추출 -> 5
        // 5 -> index 2
        answer[c] = slicedArray[k-1];
        }
        
        return answer;
        
    }
}