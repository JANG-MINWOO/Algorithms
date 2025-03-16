class Solution {
    public String solution(String myString) {
        String[] strArr = myString.split("");
        String answer = "";
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equals("a")) {
                strArr[i] = strArr[i].toUpperCase();
            } else if (!strArr[i].equals("A")) {
                strArr[i] = strArr[i].toLowerCase();
            }
            answer += strArr[i];
        }
        
        return answer;
    }
}