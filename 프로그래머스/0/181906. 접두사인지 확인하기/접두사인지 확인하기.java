class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        String s = "";
        if (is_prefix.length() <= my_string.length()) {
            s = my_string.substring(0, is_prefix.length());
        }
        if (s.equals(is_prefix)) return 1;
        return answer;
    }
}