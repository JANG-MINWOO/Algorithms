import java.util.*;

class Solution {
    public String solution(String letter) {
        Map<String, String> morseMap = new HashMap<>();
        String answer = "";
        int ascii = 97;
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        for(String s : morse) {
            morseMap.put(s, Character.toString((char) ascii));
            ascii++;
        } // 모스부호 맵 완성
        
        String[] letters = letter.split(" ");
        String[] converted = new String[letters.length];
        
        for (int i = 0; i < letters.length; i++) {
            converted[i] = morseMap.get(letters[i]);
            answer += converted[i];
        }

        return answer;
    }
}