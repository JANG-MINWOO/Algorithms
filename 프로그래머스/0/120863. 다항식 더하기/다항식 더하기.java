class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String[] polyArr = polynomial.split(" ");
        int numWithX = 0;
        int numWithoutX = 0;

        
        for (int i = 0; i < polyArr.length; i+=2) {
            if (polyArr[i].contains("x")) {
                if(polyArr[i].length() > 1) {
                    numWithX += Integer.parseInt(polyArr[i].replace("x", "")); // int 로 변환해서 대입
                } else {
                    numWithX++;
                }
            } else {
                numWithoutX += Integer.parseInt(polyArr[i]);
            }
        }
        if (numWithoutX == 0) {
            if (numWithX == 1) {
                answer = "x";
            } else {
                answer = numWithX + "x";
            }
        } else if ( numWithX == 0) {
            answer += numWithoutX;
        } else {
            if (numWithX == 1) {
                answer = "x + " + numWithoutX;
            } else {
                answer = numWithX + "x + " + numWithoutX;
            }
        }
        
        return answer;
    }
}