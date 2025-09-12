import java.util.Arrays;

class Solution {
    public int solution(int[] people, int limit) {
        
        // 모든 사람을 구출하기 위해 필요한 구명보트 개수의 최솟값 구하기
        int boats = 0;
        
        // 사람들의 몸무게를 담은 배열(people) 오름차순
        Arrays.sort(people);
        
        // left(가벼운 사람), right(무거운 사람)
        // [50, 50, 70, 80]
        int left = 0;
        int right = people.length - 1;
        
        while(left <= right) {
            if (people[left] + people[right] <= limit) {
                
                // 무게 제한이 넘지 않으면 가벼운 사람 같이 태우기
                left++;
            }
            
            // 무거운 사람은 항상 태우기
            right--;
            // 보트 사용 개수 증가
            boats++;
        }
        
        // 구출에 필요한 구명 보트 개수의 최솟값 반환
        return boats;
        
    }
}