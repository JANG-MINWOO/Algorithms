class Solution {
    public int solution(int n, int k) {
        String converted = Integer.toString(n, k); // n을 k 진법으로 전환
        String[] list = converted.split("0");
        
        int count = 0;
        for (String num : list) {
            if (!num.isEmpty() && isPrime(Long.parseLong(num))) {
                count++;
            }
        }
        return count;
    }
    
    private boolean isPrime(long num) {
        if (num < 2) return false; // 0, 1 은 소수가 아니기 때문
        for (long i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
    // num = 11 일 때
    // i = 2, 3 까지만 가능
    // i = 2 일 때, 11 % 2 = 1
    // i = 3 일 때, 11 % 3 = 2
    // true 반환
    
    // num = 10 일 때
    // i = 2, 3 까지만 가능
    // i = 2 일 때, 10 % 2 = 0, false 반환
}