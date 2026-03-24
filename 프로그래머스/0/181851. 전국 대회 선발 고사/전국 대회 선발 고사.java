import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> rank_index = new HashMap<>();
        for (int i = 0; i < rank.length; i++) {
            rank_index.put(rank[i], i); // 순위 - 인덱스 순으로 map에 등록
            if (attendance[i]) {
                list.add(rank[i]); // 참석하는 사람들만 list에 등록
            }
        }
        Collections.sort(list); // 오름차순 정렬하면 0, 1, 2 인덱스가 각각 1, 2, 3위임
        int answer = rank_index.get(list.get(0)) * 10000 + rank_index.get(list.get(1)) * 100 + rank_index.get(list.get(2));//1위 순위를 넣으면 그 순위의 인덱스가 나옴
        
        return answer;
    }
}