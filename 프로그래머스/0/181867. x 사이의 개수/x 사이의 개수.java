class Solution {
    public int[] solution(String myString) {
        String[] str_arr = myString.split("x", -1);
        int[] answer = new int[str_arr.length];
        for (int i = 0; i < str_arr.length; i++) {
            answer[i] = str_arr[i].length();
        }
        return answer;
    }
}