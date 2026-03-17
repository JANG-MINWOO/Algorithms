class Solution {
    public int solution(String binomial) {
        String[] str = binomial.split(" ");
        if (binomial.contains("+")) {
            return Integer.parseInt(str[0]) + Integer.parseInt(str[2]);
        } else if (binomial.contains("-")) {
            return Integer.parseInt(str[0]) - Integer.parseInt(str[2]);
        } else {
            return Integer.parseInt(str[0]) * Integer.parseInt(str[2]);
        }
    }
}