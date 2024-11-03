import java.util.Arrays;

class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder(); // 최종 결과를 저장할 StringBuilder
        int length = s.length(); 
        StringBuilder transformed = new StringBuilder(); // 변환된 단어를 저장할 StringBuilder

        for (int i = 0; i < length; i++) { // 입력 문자열의 각 문자를 순회
            char c = s.charAt(i); 
            if (Character.isLetter(c)) { // 단어의 시작인지 확인
                // 문자가 알파벳인 경우 대소문자 변환
                transformed.append((transformed.length() % 2 == 0) ? Character.toUpperCase(c) : Character.toLowerCase(c));
            } else { // 공백인 경우
                transformed.append(c); // 공백을 그대로 추가
                
	    if (transformed.length() > 0) {  // 변환된 문자열을 결과에 추가
                    answer.append(transformed); // 변환된 단어 추가
                    transformed.setLength(0); // 변환된 부분 초기화
                }
            }
        }
        // 마지막 변환된 단어가 있으면 결과에 추가
        answer.append(transformed);
        
        return answer.toString(); // 최종 결과 반환
    }
}


// try  hello    world