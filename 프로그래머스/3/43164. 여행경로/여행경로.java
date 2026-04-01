import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

class Solution {
    boolean found;
    boolean used[];
    List<String> route;
    
    public String[] solution(String[][] tickets) {
        found = false;
        used = new boolean[tickets.length];
        route = new ArrayList<>();
        
        Arrays.sort(tickets, (a, b) -> {
            if (a[0].equals(b[0])) return a[1].compareTo(b[1]);
            return a[0].compareTo(b[0]);
        });
        
        route.add("ICN");
        dfs("ICN", tickets);
        return route.toArray(new String[0]);
    }
    
    void dfs(String cur, String[][] tickets) {
        if (found) return;
        
        if (route.size() == tickets.length + 1) {
            found = true;
            return;
        }
        
        for (int i = 0; i < tickets.length; i++) {
            if (!used[i] && tickets[i][0].equals(cur)) {
                used[i] = true;
                route.add(tickets[i][1]);
                dfs(tickets[i][1], tickets);
                
                if (found) return;
                
                used[i] = false;
                route.remove(route.size() - 1);
            }
        }
    }
}