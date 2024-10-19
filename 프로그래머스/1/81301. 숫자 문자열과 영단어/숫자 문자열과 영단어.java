import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String s) {
        int answer =Solution.convertToNumbers(s);
        
        return answer;
    }
    
    public static int convertToNumbers(String input){
        Map<String,String> numberMap = new HashMap<>();
        numberMap.put("zero","0");
        numberMap.put("one","1");
        numberMap.put("two","2");
        numberMap.put("three","3");
        numberMap.put("four","4");
        numberMap.put("five","5");
        numberMap.put("six","6");
        numberMap.put("seven","7");
        numberMap.put("eight","8");
        numberMap.put("nine","9");
        
        StringBuilder result = new StringBuilder();
        StringBuilder wordCut = new StringBuilder();
        
        for(char ch : input.toCharArray()){
            if(Character.isDigit(ch)){
                result.append(ch);
            }else{
                wordCut.append(ch);
                String word = wordCut.toString();
                if(numberMap.containsKey(word)){
                    result.append(numberMap.get(word));
                    wordCut.setLength(0);
                }
            }
        }
        return Integer.parseInt(result.toString());
    }
}