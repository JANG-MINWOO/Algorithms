class Solution {
    public String solution(String cipher, int code) {
        String[] strArr = cipher.split("");
        String answer = "";
        for (int i = code - 1; i < strArr.length; i = i + code) {
            answer += strArr[i];
        }
        return answer;
    }
}