class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        int length = is_prefix.length();
        
        if (length > my_string.length()) {
            return answer;
        }
        
        String substring = my_string.substring(0, length);
        
        if (substring.equals(is_prefix)) {
            answer = 1;
        }
        
        return answer;
    }
}