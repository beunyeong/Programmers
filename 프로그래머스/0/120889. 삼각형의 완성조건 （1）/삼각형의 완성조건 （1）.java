class Solution {
    public int solution(int[] sides) {
        int x = sides[0];
        int y = sides[1];
        int z = sides[2];
        
        if(x+y > z && x+z > y && y+z > x) {
            return 1;
        } else {
            return 2;
        }
        
    }
}