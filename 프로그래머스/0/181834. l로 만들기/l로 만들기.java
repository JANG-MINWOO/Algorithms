class Solution {
    public String solution(String myString) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < myString.length(); i++) {
            if ((int) myString.charAt(i) > (int) 'l') sb.append(String.valueOf(myString.charAt(i)));
            else sb.append(String.valueOf('l'));
        }
        
        return sb.toString();
    }
}