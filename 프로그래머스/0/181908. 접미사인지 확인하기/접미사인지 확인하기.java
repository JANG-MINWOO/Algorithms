class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        int length = my_string.length();
        
        if (length < is_suffix.length()) {
            return answer;
        }
        
        String substring = my_string.substring(length - is_suffix.length());
        
        if (substring.equals(is_suffix)) {
            answer = 1;
        }
        
        return answer;
    }
}