import java.util.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        
        List<String> todoList = new ArrayList<>();
        for (int i = 0; i < finished.length; i++) {
            if (!finished[i]) {
                todoList.add(todo_list[i]);
            }
        }
        String[] answer = new String[todoList.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = todoList.get(i);
        }
        return answer;
    }
}