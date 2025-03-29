class Solution {
    public int solution(int[] array, int n) {
        
        // int 값을 카운트할 시작 번호 0으로 초기화
        int count = 0;
                
        // i는 0부터 array의 길이만큼 반복해서 1씩 증가
        for(int i = 0; i < array.length; i++) {
            
            // 만약 int[] 배열의 i번째 숫자가 정수 n과 동일하다면
            if(array[i] == n) {
                // count에 1씩 증가
                count++;
            }
    }
          // 결과를 int count에 담는다
          return count;

}
}