import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        Map<String, Integer> nameMap = new HashMap<>();
        
        for (int i = 0; i < name.length; i++) {
            nameMap.put(name[i], yearning[i]);
        } // 이름-그리움점수 map 생성
        
        for (int i = 0; i < photo.length; i++) {
            for (int j = 0; j < photo[i].length; j++) {
                answer[i] += nameMap.getOrDefault(photo[i][j], 0);
            }
        }
        return answer;
    }
}