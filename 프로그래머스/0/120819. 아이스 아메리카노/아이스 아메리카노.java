class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2]; // 크기가 2인 배열 선언

        int count = money / 5500;  // 구매할 수 있는 아메리카노 개수
        int change = money % 5500; // 남은 거스름돈

        answer[0] = count; // 배열에 값 저장
        answer[1] = change; 

        return answer; // 최종 결과 반환
    }
}