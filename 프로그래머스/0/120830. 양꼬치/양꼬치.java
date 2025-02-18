class Solution {
    public int solution(int n, int k) {
        int sum = 12000 * n + 2000 * k; //총 가격
        
        if (n / 10 != 0) {
            int service = n / 10;
            
            if (service < k) {
                sum -= service * 2000;
            } else {
                sum -= k * 2000;
            }
        }
        return sum;
    }
}