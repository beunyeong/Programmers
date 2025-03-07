class Solution {
    public int[] solution(String[] strlist) {
        // strlist의 길이만큼 크기를 가진 int 배열 answer 생성
        int[] answer = new int[strlist.length];
            
            // 각 문자열의 길이를 answer 배열에 저장
            for(int i = 0; i < strlist.length; i++) {
                answer[i] = strlist[i].length();
            }
            
        return answer;
    }
}