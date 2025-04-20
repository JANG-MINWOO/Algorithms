class Solution {
    public String solution(String myString, String pat) {
        
        int lastIndex = -1;
        
        for (int i = 0; i <= myString.length() - pat.length(); i++) {
            String sub = myString.substring(i, i + pat.length());
            if (sub.equals(pat)) {
                lastIndex = i;
            }
        }
        
        String answer = myString.substring(0, lastIndex + pat.length());
        
        return answer;
    }
}