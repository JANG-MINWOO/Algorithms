class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for (int i = 0; i < quiz.length; i++) {
            String[] splited = quiz[i].split(" ");
            int first = Integer.parseInt(splited[0]);
            int second = Integer.parseInt(splited[2]);
            int sum = Integer.parseInt(splited[4]);
            int check = 0;
            
            if (splited[1].equals("+")) {
                check = first + second;
            } else if (splited[1].equals("-")) {
                check = first - second;
            }
            
            if (check == sum) {
                answer[i] = "O";
            } else {
                answer[i] = "X";
            }
        }
        return answer;
    }
}