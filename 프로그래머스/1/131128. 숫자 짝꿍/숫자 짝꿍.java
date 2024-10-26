import java.util.HashMap;
class Solution {
    public String solution(String X, String Y) {
        HashMap<Character,Integer> countMapX = new HashMap<>();
        HashMap<Character,Integer> countMapY = new HashMap<>();
        
        // 카운트하려는 숫자들 0~9
        char[] numbersToCount = {'0','1','2','3','4','5','6','7','8','9'};
        
        // 초기화: 카운트할 숫자를 미리 0으로 설정
        for (char num : numbersToCount) {
            countMapX.put(num, 0);
            countMapY.put(num, 0);
        }
        
        // 문자열을 순회하면서 카운트
        for (char c : X.toCharArray()) {
            if (countMapX.containsKey(c)) {
                countMapX.put(c, countMapX.get(c) + 1);
            }
        }
        for (char c : Y.toCharArray()) {
            if (countMapY.containsKey(c)) {
                countMapY.put(c, countMapY.get(c) + 1);
            }
        }
        
        // 결과 문자열을 저장할 StringBuilder
        StringBuilder result = new StringBuilder();
        // 공통 숫자가 있는지 확인
        boolean hasCommonDigits = false;  
        
        
        // 9부터 0까지 순차적으로 확인
        for (int i = 9; i >= 0; i--) {
            char digit = (char) (i + '0');  // '0'의 아스키 값을 더해 숫자를 문자로 변환
            
            // 두 맵에서 해당 숫자의 카운트 중 최소값을 가져옴
            int countInX = countMapX.get(digit);
            int countInY = countMapY.get(digit);
            int minCount = Math.min(countInX, countInY);
            
            if (minCount > 0) {
                hasCommonDigits = true;  // 공통 숫자가 있음을 표시
            }
            
            // 만약 '0'만 존재하는 경우에는 바로 "0"을 반환
            if (result.length() == 0 && digit == '0' && minCount > 0) {return "0";}
            
            // 최소값만큼 해당 숫자를 결과에 추가
            for (int j = 0; j < minCount; j++) {
                result.append(digit);
            }
        }
        
        if (!hasCommonDigits) {
            return "-1";
        }
        String answer = result.toString();
        return answer;
    }
    
    
}

//1. 핵심은 그냥 존재유무만 판단하는것이 아닌 1:1 대응이어야 한다는것
//2. 즉 중복이 허용된다
//풀이방식
//1. x y 문자열에 0~9까지 숫자가 각각 몇번나왔는지 카운트하기
//2. 0~9까지 숫자가 나온횟수만큼 내림차순으로 붙이기