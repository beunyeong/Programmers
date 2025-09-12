class Solution {
    public int solution(int[][] sizes) {
        
        int maxW = 0;
        int maxH = 0;
        
        for(int i=0; i < sizes.length; i++) {
            
            // 가로(w), 세로(h) 값 가져오기
            int w = sizes[i][0];
            int h = sizes[i][1];
            
            // 가로길이(W)가 더 길어야 함
            // 만약 세로(H) 숫자가 짧으면 뒤집기 위해 값 추출
            int bigW = Math.max(w,h);
            int smallH = Math.min(w,h);
            
            // 뒤집은 값이 있다면 갱신해주기
            maxW = Math.max(maxW, bigW);
            maxH = Math.max(maxH, smallH);
        }
        
        return maxW * maxH;
        
    }
}