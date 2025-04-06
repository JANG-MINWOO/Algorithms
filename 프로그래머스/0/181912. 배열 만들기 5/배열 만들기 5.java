import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < intStrs.length; i++) {
            List<String> list = new ArrayList<>();
            String[] splited = intStrs[i].split("");
            
            for (int j = s; j < s + l; j++) {
                list.add(splited[j]);
            }
            String check = "";
            for (int j = 0; j < list.size(); j++) {
                check += list.get(j);
            }
            
            int convert = Integer.parseInt(check);
            
            if (convert > k) {
                result.add(convert);
            }
        }
        
        int[] answer = new int[result.size()];
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }
}