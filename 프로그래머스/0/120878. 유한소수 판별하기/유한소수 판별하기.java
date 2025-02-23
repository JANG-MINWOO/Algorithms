class Solution {
    public int solution(int a, int b) {
        int answer = 1;
        int convertedB = b / gcd(a, b);
        boolean check = true;
        
        while (convertedB % 2 == 0) {
            convertedB /= 2;
        }
        while (convertedB % 5 == 0) {
            convertedB /= 5;
        }
        
        if (convertedB != 1) {
            answer = 2;
        }
        
        return answer;
    }
    
    private int gcd(int a, int b) {
        while(b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}