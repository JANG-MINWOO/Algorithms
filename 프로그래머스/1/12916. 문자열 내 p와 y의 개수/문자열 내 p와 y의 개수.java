class Solution {
    boolean solution(String s) {
        String[] strArr = s.split("");
        int pCount = 0;
        int yCount = 0;
        boolean answer = true;
        
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equals("p") || strArr[i].equals("P")) {
                pCount++;
            } else if (strArr[i].equals("y") || strArr[i].equals("Y")) {
                yCount++;
            }
        }
        
        if (pCount != yCount) {
            answer = false;
        }

        return answer;
    }
}