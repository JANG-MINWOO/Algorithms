import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        Map<String, HashSet<String>> reports = new HashMap<>();
        Map<String, Integer> mailCount = new HashMap<>();
        
        //유저별 초기화
        for(String id : id_list) {
            reports.put(id, new HashSet<>());
            mailCount.put(id,0);
        }
        
        for(String r : report) {
            String[] parts = r.split(" ");
            String reporter = parts[0];
            String reported = parts[1];
            reports.get(reported).add(reporter);
        }
        
        for(String reported : reports.keySet()) {
            if (reports.get(reported).size() >= k) {
                for(String reporter : reports.get(reported)) {
                    mailCount.put(reporter, mailCount.get(reporter) + 1);
                }
            }
        }
        int[] answer = new int[id_list.length];
        for (int i = 0; i < id_list.length; i++) {
            answer[i] =mailCount.get(id_list[i]);
        }
        return answer;
    }
}