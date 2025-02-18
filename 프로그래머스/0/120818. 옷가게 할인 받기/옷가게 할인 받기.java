class Solution {
    public double solution(int price) {
        double answer = 0;
        int result = 0;
        
        if (price >= 500000) {
            answer = (double) price * 0.80;
            return result = (int) answer;
            
        } else if (price >= 300000) {
            answer = (double) price * 0.90;
            return result = (int) answer;
            
        } else if (price >= 100000) {
            answer = (double) price * 0.95;
            return result = (int) answer;
        } else {
            return price;
        }
    }
}