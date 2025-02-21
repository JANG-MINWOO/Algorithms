class Solution {
    public long solution(String numbers) {
        String result = "";
        String current = numbers;
        while (true) {
            // one 만 남은경우
            if (current.length() < 3) break;
            
            if (current.charAt(0) == 'z') {
                result += "0";
                current = current.substring(4, current.length());
            } else if (current.charAt(0) == 'o') {
                result += "1";
                current = current.substring(3, current.length());
            } else if (current.charAt(0) == 't') {
                if (current.charAt(1) == 'w') {
                    result += "2";
                    current = current.substring(3, current.length());
                } else {
                    result += "3";
                    current = current.substring(5, current.length());
                }
            } else if (current.charAt(0) == 'f') {
                if (current.charAt(1) == 'o') {
                    result += "4";
                    current = current.substring(4, current.length());
                } else {
                    result += "5";
                    current = current.substring(4, current.length());
                }
            } else if (current.charAt(0) == 's') {
                if (current.charAt(1) == 'i') {
                    result += "6";
                    current = current.substring(3, current.length());
                } else {
                    result += "7";
                    current = current.substring(5, current.length());
                }
            } else if (current.charAt(0) == 'e') {
                result += "8";
                current = current.substring(5, current.length());
            } else {
                result += "9";
                current = current.substring(4, current.length());
            }
            
        }
        
        long answer = Long.parseLong(result);
        
        return answer;
    }
}