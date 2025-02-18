class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] str = my_string.split("");
        
        for (int i = 0; i < str.length; i++) {
            if (isNumber(str[i])) {
                answer += Integer.parseInt(str[i]);
            }
        }
        return answer;
    }
    
    private boolean isNumber(String s) {
        switch (s) {
            case "1" : return true;
            case "2" : return true;
            case "3" : return true;
            case "4" : return true;
            case "5" : return true;
            case "6" : return true;
            case "7" : return true;
            case "8" : return true;
            case "9" : return true;
            default : return false;
        }
    }
}