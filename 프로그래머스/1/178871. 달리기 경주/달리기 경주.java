import java.util.HashMap;
import java.util.Map;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> nameRank = new HashMap<>();
        Map<Integer, String> rankName = new HashMap<>();
        for(int i=0; i<players.length;i++){
            nameRank.put(players[i],i);
            rankName.put(i,players[i]);
        }
        
        for(String calledName : callings){
            int currentRank = nameRank.get(calledName);
            int previousRank = currentRank - 1;
            
            String previousName = rankName.get(previousRank); //앞선수 이름 가져오기
            
            nameRank.put(calledName, previousRank); //이름-랭크 순서 변경
            nameRank.put(previousName, currentRank);
            
            rankName.put(previousRank, calledName); //랭크-이름 순서변경
            rankName.put(currentRank, previousName);
        }
        String[] answer = new String[players.length];
        for (int i = 0; i < players.length; i++) {
            answer[i] = rankName.get(i);
        }
        return answer;
    }
}