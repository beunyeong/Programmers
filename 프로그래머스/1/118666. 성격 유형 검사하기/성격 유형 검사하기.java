/**
 * - survey[i]: 각 질문의 성격 지표 쌍(예: "RT", "CF")  // 왼쪽=비동의, 오른쪽=동의
 * - choices[i]: 선택 값(1~7)
 *   - 1~3: 왼쪽에 3,2,1점 / 4: 0점 / 5~7: 오른쪽에 1,2,3점
 *
 * KeyPoint:
 * - 모든 질문의 점수를 누적한 뒤, 각 지표(RT/CF/JM/AN)에서 더 큰 점수를 가진 유형 선택
 * - 점수가 같으면 사전순(왼쪽 문자) 선택 => 비교 연산을 >= 로 처리
 *
 * - 자료구조: Map(Character -> 점수), 구현체 HashMap
 */

import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] survey, int[] choices) {
        
        // 성격 유형 문자 목록 초기화
        char[] categories = {'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N'};
        
        // key: 성격 유형 문자, value: 누적 점수
        Map<Character, Integer> point = new HashMap<>();
        
        // 모든 유형 점수를 0으로 초기화
        // (누적 시 point.get(...)가 null 되는 것 방지)
        for(char t : categories) {
            point.put(t,0);
        }
        
        for(int i = 0; i < survey.length; i++) {
            char left = survey[i].charAt(0);
            char right = survey[i].charAt(1);
            
            int choice = choices[i];
            
            if(choice < 4) {
                // 1~3(비동의): 왼쪽에 (4-choice)점 누적
                point.put(left, point.get(left) + (4 - choice));
            } else if(choice > 4) {
                // 5~7(동의): 오른쪽에 (choice-4)점 누적
                point.put(right, point.get(right) + (choice - 4));
            }
        }
        
        StringBuilder answer = new StringBuilder();
        answer.append(point.get('R') >= point.get('T') ? 'R' : 'T');
        answer.append(point.get('C') >= point.get('F') ? 'C' : 'F');
        answer.append(point.get('J') >= point.get('M') ? 'J' : 'M');
        answer.append(point.get('A') >= point.get('N') ? 'A' : 'N');
        
        
        // 성격 유형 검사 결과 반환
        return answer.toString();
        
    }
}