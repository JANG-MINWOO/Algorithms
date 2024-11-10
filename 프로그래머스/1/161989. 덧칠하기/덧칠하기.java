class Solution {
    public int solution(int n, int m, int[] section) {
        int result = 0;
        int start = 0;
        
        for(int i = 0 ; i < section.length ; i++){
            if(section[i]>start){
                result++;
                start = section[i]+m-1;
            }
        }
        return result;
    }
}