class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        String str = ineq + eq;
        if (str.equals(">=")) {
            if (n >= m) return 1;
        } else if (str.equals("<=")) {
            if (n <= m) return 1;
        } else if (str.equals(">!")) {
            if (n > m) return 1;
        } else {
            if (n < m) return 1;
        }
        return 0;
    }
}