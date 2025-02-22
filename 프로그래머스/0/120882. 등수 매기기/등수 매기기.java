import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        int n = score.length;
        int[] answer = new int[n];
        
        List<double[]> avgList = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            double avg = (score[i][0] + score[i][1]) / 2.0;
            avgList.add(new double[] {avg, i}); //평균점수, 원래인덱스 추가
        }
        
        avgList.sort((a, b) -> Double.compare(b[0], a[0])); // 평균을 내림차순으로 정렬
        
        int rank = 1;
        for (int i = 0; i < n; i++) {
            if (i > 0 && avgList.get(i)[0] != avgList.get(i - 1)[0]) {
                rank = i + 1;
            }
            answer[(int) avgList.get(i)[1]] = rank;
        }
        return answer;
    }
}