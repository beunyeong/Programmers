import java.util.HashSet;

class Solution {
    public int solution(String[] s1, String[] s2) {

        // s1배열을 HashSet에 저장
        HashSet<String> set = new HashSet<>();
        
        // s1의 배열의 원소를 HashSet에 추가 (str: s1의 개별 요소)
        for(String str : s1) {
            set.add(str);
        }
        
        // count는 0부터 시작하도록 초기화
        int count = 0;
        
        for(String str : s2) {
            // 만약 s2 배열의 원소가 s1의 원소가 존재하면 count 증가
            if(set.contains(str)) {
                count ++;
            }
        }
        
        return count;
        
    }
}