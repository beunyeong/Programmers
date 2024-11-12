class Solution {
    public int solution(int angle) {
        int answer = 0;
        
        if (90 > angle) {
            return 1;  //예각
        } else if (90 == angle) {
            return 2;  //직각
        } else if (180 > angle) {
            return 3;  //둔각
        } else {
            return 4;  //평각
        }
        
    
    }
}