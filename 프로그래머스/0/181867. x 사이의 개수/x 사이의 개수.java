class Solution {
    public int[] solution(String myString) {
        String[] strArr = myString.split("x");
        String last = myString.substring(myString.length() - 1);
        
        int[] answer;
        
        if (last.equals("x")) {
            answer = new int[strArr.length + 1];
            answer[strArr.length] = 0;
        } else {
            answer = new int[strArr.length];
        }
        
        for (int i = 0; i < strArr.length; i++) {
            answer[i] = strArr[i].length();
        }
        return answer;
    }
}