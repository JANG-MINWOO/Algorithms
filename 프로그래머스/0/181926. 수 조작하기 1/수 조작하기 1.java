class Solution {
    public int solution(int n, String control) {
        int answer = n;
        String[] strArr = control.split("");
        
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equals("w")) {
                answer += 1;
            } else if (strArr[i].equals("s")) {
                answer -= 1;
            } else if (strArr[i].equals("d")) {
                answer += 10;
            } else {
                answer -= 10;
            }
        }
        return answer;
    }
}