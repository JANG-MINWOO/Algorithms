class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        for(char c: s.toCharArray()){
            if(Character.isLowerCase(c)){
                char shifted = (char)((c-'a'+n)%26+'a');
                answer.append(shifted);
            }else if(Character.isUpperCase(c)){
                char shifted = (char)((c-'A'+n)%26+'A');
                answer.append(shifted);
            }else{
                answer.append(c);//공백은 그냥추가
            }
        }
        return answer.toString();
    }
}

//아스키코드값을 이용해서 변환
//단순히 n 값을 더하기만 해선 안됨. 그럼 소문자 대문자 등의 범위를 벗어날 수 있음
//예를들어 문자 c 이면 c의 아스키코드값에서 a의 아스키 코드값을 빼면
//c의 상대적 위치값이 나옴. 그 값에서 이동할 n 값만큼 이동시킨후 26을 나머지나누기를 해주어야 26을초과해도 제자리로 돌아오는 효과가 있음
//그런다음 a의 아스키코드값을 다시 더해줘서 아스키코드값을 제대로 맞춰줌