import java.util.Arrays;

class Solution {
    public String[] solution(String myString) {
        myString = myString.replaceAll("x+", "x");
        if (myString.charAt(myString.length() - 1) == 'x') myString = myString.substring(0, myString.length() - 1);
        if (myString.charAt(0) == 'x') myString = myString.substring(1);
        
        String[] answer = myString.split("x");
        Arrays.sort(answer);
        return answer;
    }
}