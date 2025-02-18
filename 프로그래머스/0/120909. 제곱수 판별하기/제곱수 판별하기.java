class Solution {
    public int solution(int n) {

        double check = Math.sqrt(n);
        
        if (check % 1 == 0) {
            return 1;
        }
        return 2;
    }
}