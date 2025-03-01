import java.util.*;

class Solution {
    public int solution(int n, int w, int num) {
        List<List<Integer>> columns = new ArrayList<>();
        for (int i = 0; i < w; i++) {
            columns.add(new ArrayList<>());
        }
        
        int boxNumber = 1;
        boolean leftToRight = true;

        while (boxNumber <= n) {
            if (leftToRight) {
                for (int i = 0; i < w && boxNumber <= n; i++) {
                    columns.get(i).add(boxNumber++);
                }
            } else {
                for (int i = w - 1; i >= 0 && boxNumber <= n; i--) {
                    columns.get(i).add(boxNumber++);
                }
            }
            leftToRight = !leftToRight; // 방향 전환
        }
        
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