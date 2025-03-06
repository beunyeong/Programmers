class Solution {
    public int solution(int[] array, int height) {
        // 머쓱이 보다 키가 큰 학생의 수를 저장할 변수
        int count = 0;
        
        // array 배열로 각 학생의 키를 확인
        for(int student : array) {
            // 만약 학생의 키가 머쓱이(height)보다 크다면 count 증가  
            if(student > height) {
                count++;
            }
        }
        
        // 최종적으로 머쓱이보다 키가 큰 학생의 수 반환
        return count;
    }
}