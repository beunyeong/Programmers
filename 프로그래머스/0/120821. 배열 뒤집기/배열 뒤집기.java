class Solution {
    public int[] solution(int[] num_list) {
        
        // 배열의 길이
        int length = num_list.length;
        
        // 객체 생성
        int[] answer = new int[length];
            
        // 5-1-0 = 4, 5-1-1 = 3, 5-1-2 = 2...  
        for(int i = 0; i < length; i++ ) {
           answer[i] = num_list[length - 1 -i];

        }
        
        return answer;
    }
}