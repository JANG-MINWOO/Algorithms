class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        
        int commonDenom = denom1 * denom2; //분모 8
        
        int leftNum = numer1 * denom2; // 왼쪽분자
        int rightNum = numer2 * denom1; // 오른쪽분자
        
        int sumOfNums = leftNum + rightNum;
        
        answer[0] = sumOfNums / gcd(sumOfNums, commonDenom);
        answer[1] = commonDenom / gcd(sumOfNums, commonDenom);

        return answer;
    }
    
    private int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        
        return a;
    }
}