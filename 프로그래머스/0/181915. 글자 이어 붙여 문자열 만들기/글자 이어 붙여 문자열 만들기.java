class Solution {
    public String solution(String my_string, int[] index_list) {
        StringBuilder str = new StringBuilder();
        
        for (int i = 0; i < index_list.length; i++) {
            str.append(my_string.charAt(index_list[i]));
        }
                       
        String answer = str.toString();
        return answer;
    }
}