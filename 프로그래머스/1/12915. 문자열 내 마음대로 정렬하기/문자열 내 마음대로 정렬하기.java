import java.util.Arrays;
class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings,(word1,word2)->{
            char char1 = word1.charAt(n);
            char char2 = word2.charAt(n);
            
            if(char1 == char2){
                return word1.compareTo(word2);
            }
            return Character.compare(char1,char2);
        });
        return strings;
    }
}