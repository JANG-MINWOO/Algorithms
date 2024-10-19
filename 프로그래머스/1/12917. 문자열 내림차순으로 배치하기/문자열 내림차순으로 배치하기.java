import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split(""); //String 배열에 ""기준으로 하나씩 쪼개서 넣기
        Arrays.sort(str,Collections.reverseOrder());  //Arrays 임포트후 sort메서드를 쓰는데 두번째 매개변수로
                                                    //Collections.reverseOrder() 메서드를 넣어주면 내림차순으로 됨
        //하나씩 대입해서 완성한다. 내생각에 대문자가 소문자보다 자동으로 작게 되는것은 아스키 코드표 값에 따라 하기때문인듯 하다
        for(String a: str){
            answer+=a;
        }
        return answer;
    }
}