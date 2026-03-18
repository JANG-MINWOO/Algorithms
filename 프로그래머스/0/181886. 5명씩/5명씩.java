import java.util.List;
import java.util.ArrayList;

class Solution {
    public String[] solution(String[] names) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < names.length; i += 5) {
            // if (i >= names.length) break;
            list.add(names[i]);
        }
        return list.toArray(new String[0]);
    }
}