import java.util.*;

// 실패율 스테이지에 도달해 있는 사람수 / 도달하고 클리어도 한 전체 사람 수
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] stagePeople = new int[N + 2]; // 스테이지별 머물고 있는 사람수
        int totalPlayers = stages.length;
        
        for (int stage : stages) {
            stagePeople[stage]++;
        }
        
        List<double[]> failRates = new ArrayList<>(); // 스테이지, 실패율 저장
        
        int reachedPeopleCount = totalPlayers;
        for (int i = 1; i <= N; i++) {
            if (reachedPeopleCount == 0) {
                failRates.add(new double[] {i, 0.0}); // 도달한 사람수가 0이면 실패율도 0
            } else {
                double failRate = (double) stagePeople[i] / reachedPeopleCount;
                failRates.add(new double[] {i, failRate});
                reachedPeopleCount -= stagePeople[i]; // 다음스테이지에선 현재스테이지에 머문사람수 만큼 빼고 넘어감
            }
        }
        
        failRates.sort((a, b) -> {
            if (b[1] == a[1]) return Double.compare(a[0], b[0]);
            return Double.compare(b[1], a[1]);
        });
        
        int[] result = new int[failRates.size()];
        for (int i = 0; i < failRates.size(); i++) {
            result[i] = (int) failRates.get(i)[0];
        }
        
        return result;
    }
}