import java.util.*;

class Solution {
    public int solution(int n, int w, int num) {
        List<List<Integer>> columns = new ArrayList<>();
        
        for (int i = 0; i < w; i++) {
            columns.add(new ArrayList<>());
        } // w 의 맞춰서 세로열 리스트 설정
        
        boolean leftToRight = true;
        int boxCount = 1;
        
        while (boxCount <= n) {
            if (leftToRight) {
                for (int i = 0; i < w && boxCount <= n; i++) {
                    columns.get(i).add(boxCount++);
                }
            } else {
                for (int i = w - 1; i >= 0 && boxCount <= n; i--) {
                    columns.get(i).add(boxCount++);
                }
            } //한번 가로로 진행이 끝나고 나면
            leftToRight = !leftToRight; // 방향전환
        } // 지그재그로 박스 전부쌓기
        
        int count = 0;
        for (List<Integer> column : columns) {
            if (column.contains(num)) {
                count = column.size() - column.indexOf(num);
                break;
            }
        }
        return count;
    }
}