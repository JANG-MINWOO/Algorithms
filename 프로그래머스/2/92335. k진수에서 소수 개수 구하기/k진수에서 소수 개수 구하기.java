class Solution {
    public int solution(int n, int k) {
        // 1. 정수를 k진법으로 변환
        String converted = Integer.toString(n, k);

        // 2. '0'을 기준으로 숫자 나누기
        String[] candidates = converted.split("0");

        int count = 0;
        for (String num : candidates) {
            if (!num.isEmpty() && isPrime(Long.parseLong(num))) {
                count++;
            }
        }
        return count;
    }

    // 3. 소수 판별 함수
    private boolean isPrime(long num) {
        if (num < 2) return false; // 0, 1은 소수가 아님
        for (long i = 2; i * i <= num; i++) {
            if (num % i == 0) return false; // 나누어떨어지면 소수가 아님
        }
        return true;
    }
}