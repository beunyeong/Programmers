import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n, int[] numlist) {
        
        // 결과를 저장할 리스트 생성
        List<Integer> list = new ArrayList<>();
        
        // numlist의 값들을 리스트에 추가
        for(int i = 0; i < numlist.length; i++) {
            if(numlist[i] % n == 0)     // n의 배수인지 확인
            list.add(numlist[i]);       // n의 배수만 추가
        }
        
        // List<Integer>를 int[]로 변환하기
        int[] answer = new int[list.size()];
        
        // 리스트 값을 배열에 복사하기
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}