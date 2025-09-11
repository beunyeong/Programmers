import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        
        // 신청 금액이 작은 부서 부터 진행 하도록(오름차순)
        // 그래야 최대한 많은 부서의 물품을 구매할 수 있음
        Arrays.sort(d);
        
        int budgetSum = 0;      // 예산 합계
        int divisionCount = 0;  // 신청 부서 수
        
        for (int requestBudget : d) {
            if (budgetSum + requestBudget > budget) {
                break;
            }
            
            // 예산이 넘지 않으면
            // 요청 예산을 예산 합계에 합산 -> break 걸릴때까지
            budgetSum += requestBudget;
            
            // 신청 부서 수 카운트
            divisionCount++;
        }
        
        // 최종 지원 가능한 부서 수 return
        return divisionCount;
    }
}