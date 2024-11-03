class Solution {
    public String solution(String s) {
        String answer = "";
        int length = s.length();
        if((length!=1)&&(length%2==0)){ //단어의 길이가 짝수면
            answer=s.substring(length/2-1,length/2+1);
        }else if((length!=1)&&(length%2==1)){//단어의 길이가 홀수면
            answer=s.substring(length/2,length/2+1);
        }else{
            answer=s;
        }
        return answer;
    }
}
// abcdefghijklmnop 라는 문자열이면 16글자이고 인덱스는 0~15 중간의 두글자는 7번8번 2글자임
// substring 을 사용해서 자르기