class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String sum = "" + a + b;
        if (Integer.parseInt(sum) > 2 * a * b) {
            answer = Integer.parseInt(sum);
        } else {
            answer = 2 * a * b;
        }
        return answer;
    }
}