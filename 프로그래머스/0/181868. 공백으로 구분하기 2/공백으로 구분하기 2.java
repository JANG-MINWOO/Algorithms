class Solution {
    public String[] solution(String my_string) {
        my_string = my_string.replaceAll("\\s+", " ");
        if (my_string.indexOf(' ') == 0) {
            my_string = my_string.substring(1, my_string.length());
        }
        String[] answer = my_string.split(" ");;
        return answer;
    }
}