class Solution {
    public String solution(String[] arr) {
        StringBuilder str = new StringBuilder();
        for (String str1 : arr) {
            str.append(str1);
        }
        String answer = str.toString();
        return answer;
    }
}