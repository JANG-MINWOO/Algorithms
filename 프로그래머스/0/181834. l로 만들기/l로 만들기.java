class Solution {
    public String solution(String myString) {
        String example = "abcdefghijk";
        String[] strArr = myString.split("");
        
        StringBuilder answer = new StringBuilder();
        
        for (int i = 0; i < myString.length(); i++) {
            if (example.contains(strArr[i])) {
                answer.append('l');
            } else {
                answer.append(strArr[i]);
            }
        }
        return answer.toString();
    }
}