class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        while(pat.length() <= myString.length()) {
            if (!myString.contains(pat)) break;
            answer++;
            myString = myString.substring(myString.indexOf(pat) + 1, myString.length());
        }
        return answer;
    }
}