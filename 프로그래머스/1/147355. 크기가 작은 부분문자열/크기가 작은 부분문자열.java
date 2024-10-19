
class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        long pNum = Long.parseLong(p);
        int lengthP=p.length();
        
        for(int i=0;i<t.length()-lengthP+1;i++){
            long subNum = Long.parseLong(t.substring(i,i+lengthP));
            if(subNum<=pNum) answer++;
        }
        return answer;
    }
}

//for문의 범위지정할때, t.length()-lengthP 로만 해뒀더니, 예시 3번에서 오류가 났었다.

//t 10203 p 15 일때, t.length() 는 5, lengthP 는 2.
//i 가 0부터 시작하여 3까지 할때, 실제로 자르는건 인덱스 01 12 23 까지만 자른다.
//즉, 10 02 20 03 로 잘라야하는데 10 02 20까지만 잘라서, +1을 해주어야 03 까지 자른다.
//(또는 <= 조건으로 변경하면 가능)