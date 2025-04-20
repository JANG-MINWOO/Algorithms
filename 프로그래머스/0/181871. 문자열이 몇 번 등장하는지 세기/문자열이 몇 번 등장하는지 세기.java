class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int length = pat.length();
        for (int i = 0; i < myString.length() - length + 1; i++) {
            String check = myString.substring(i, i + length);
            if (pat.equals(check)) {
                answer++;
            }
        }
        return answer;
    }
}