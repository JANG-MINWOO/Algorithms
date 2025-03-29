class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        String[] splited = my_string.split("");
        int idx = 0;
        
        String[][] converted = new String[my_string.length() / m][m];
        for (int i = 0; i < converted.length; i++) {
            for (int j = 0; j < m; j++) {
                converted[i][j] = splited[idx];
                idx++;
            }
        }
        
        for (int i = 0; i < converted.length; i++) {
            answer += converted[i][c - 1];
        }
        
        return answer;
    }
}