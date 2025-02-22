class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int coupon = chicken;
        
        while(coupon >= 10) { // chicken 이 101일때 들어감

            answer += coupon / 10; // 서비스로 먹은 치킨수 - answer = 10

            coupon += -(coupon / 10) * 10 + (coupon / 10); // 101 - 100 + 10= 11
        }
        
        return answer;
    }
}