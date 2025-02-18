class Solution {
    public String solution(String my_string) {
        char[] ch = my_string.toCharArray();
        int index = 0;
        int length = ch.length;
        String answer = "";
        
        for (int i = 0; i < length; i++) {
            index = (int) ch[i];
            if (index >= 65 && index <= 90) {
                index += 32;
            } else {
                index -= 32;
            }
            
            answer += (char) index;
            index = 0; //초기화
        }

        return answer;
    }
}