class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0, 0};
        int x = (board[0] - 1) / 2;
        int y = (board[1] - 1) / 2;
        
        for (int i = 0; i < keyinput.length; i++) {
            if (keyinput[i].equals("left")) {
                if (answer[0] > -x) answer[0] -= 1;
            } else if (keyinput[i].equals("right")) {
                if (answer[0] < x) answer[0] += 1;
            } else if (keyinput[i].equals("up")) {
                if (answer[1] < y) answer[1] += 1;
            } else {
                if (answer[1] > -y) answer[1] -= 1;
            }
        }
        
        return answer;
    }
}