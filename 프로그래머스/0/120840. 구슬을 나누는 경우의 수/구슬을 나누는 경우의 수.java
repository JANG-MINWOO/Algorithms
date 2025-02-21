import java.math.BigInteger;

class Solution {
    public int solution(int balls, int share) {
        int answer = comb(balls, share).intValue();
        
        return answer;
    }
    
    private BigInteger comb(int n, int r) {
        BigInteger bunja = BigInteger.ONE;
        BigInteger bunmo = BigInteger.ONE;
        
        for (int i = 0; i < r; i++) {
            bunja = bunja.multiply(BigInteger.valueOf(n - i));
            bunmo = bunmo.multiply(BigInteger.valueOf(i + 1));
        }
        
        return bunja.divide(bunmo);
    }
}