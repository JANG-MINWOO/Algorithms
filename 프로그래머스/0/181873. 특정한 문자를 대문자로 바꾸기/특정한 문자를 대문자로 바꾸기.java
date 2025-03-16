class Solution {
    public String solution(String my_string, String alp) {
        String upper = alp.toUpperCase();
        String answer = my_string.replaceAll(alp, upper);
        return answer;
    }
}