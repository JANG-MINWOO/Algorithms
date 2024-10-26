class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long sum = (long)(price+price*count)*count/2;
        if(money>=sum){
            return answer = 0;
        }else{
            return answer = sum-money;
        }
    }
}