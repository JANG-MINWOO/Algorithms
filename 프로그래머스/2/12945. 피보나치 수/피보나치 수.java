class Solution {
    public int solution(int n) {
        long[] result = fibo(n);
        int answer = (int) (result[n]%1234567);
        return answer;
    }
    
    public long[] fibo(int n) {
        long[] nacci = new long[n+1];
        nacci[0] = 0;
        nacci[1] = 1;
        for(int i = 2; i <= n; i++){
            nacci[i] = (nacci[i-1]+nacci[i-2])%1234567;
        }
        return nacci;
    }
}