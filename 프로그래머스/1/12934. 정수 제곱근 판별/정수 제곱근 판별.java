class Solution {
    public long solution(long n) {
        long answer = 0;
        double sqrt=Math.sqrt(n);
        if (sqrt%1 ==0){
            sqrt=Math.pow(sqrt+1,2);
            answer=(long)sqrt;
        }else{
            answer=-1;
        }
        return answer;
    }
}