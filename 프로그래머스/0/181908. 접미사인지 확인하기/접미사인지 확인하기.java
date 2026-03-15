class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        String s = "";
        if (my_string.length() - is_suffix.length() >= 0) {
            s = my_string.substring(my_string.length() - is_suffix.length());
        } else return 0;
        if (s.equals(is_suffix)) {
            return 1;
        }
        return answer;
    }
}