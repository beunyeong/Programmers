class Solution {
    public int[] solution(int[] num_list) {
        
        //0 인덱스: 짝수, 1 인덱스: 홀수
        int[] answer = new int[2];
        
        for(int num : num_list) {
            answer[num % 2]++;
        }
        
        return answer;
    }
}