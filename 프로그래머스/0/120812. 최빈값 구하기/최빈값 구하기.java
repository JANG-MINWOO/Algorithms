import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        if (array.length == 1) {
            return array[0];
        }
        
        Map<Integer, Integer> countMap = new HashMap<>();
        
        for (int i = 0; i < array.length; i++) {
            countMap.put(array[i], countMap.getOrDefault(array[i], 0) + 1);
        }
        Set<Integer> keySet = countMap.keySet();
        List<int[]> countList = new ArrayList<>();
        for (int i : keySet) {
            countList.add(new int[]{i, countMap.get(i)}); //key - count
        }
        
        countList.sort((a, b) -> Integer.compare(b[1], a[1]));
        if (countList.size() == 1) return countList.get(0)[0];
        
        if (countList.get(0)[1] == countList.get(1)[1]) return -1;
        
        else return countList.get(0)[0];
        
    }
}