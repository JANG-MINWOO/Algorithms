import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public int solution(String begin, String target, String[] words) {
        boolean[] visited = new boolean[words.length];
        Queue<String[]> queue = new LinkedList<>();
        queue.add(new String[]{begin, "0"});
        
        while (!queue.isEmpty()) {
            String[] cur = queue.poll();
            String word = cur[0];
            int dist = Integer.parseInt(cur[1]);
            
            for (int i = 0; i < words.length; i++) { // 전체 단어를 돌면서
                if (visited[i]) continue; //방문했던 단어라면 스킵
                
                int count = 0; //단어 비교용
                for (int j = 0; j < word.length(); j++) {
                    if (word.charAt(j) == words[i].charAt(j)) count++; // 최근 단어(cur)와 돌고있는 단어를 charAt으로 비교
                } //같으면 카운트 올려놓고
                
                if (count == word.length() - 1) { //단어가 1글자만 다른 단어이면
                    if (words[i].equals(target)) return dist + 1; // 그 한글자가 다른 단어가 target 과 같으면 도달완료 하니 거리 1 더해서 리턴
                    visited[i] = true;
                    queue.add(new String[]{words[i], String.valueOf(dist + 1)});
                }
            }
        }
        return 0;
    }
}