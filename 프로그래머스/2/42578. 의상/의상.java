import java.util.HashMap;

class Solution {
    public int solution(String[][] clothes) {
        //의상 종류와 갯수 저장
        HashMap<String, Integer> clothingMap = new HashMap<>();
        
        //의상 종류별 개수
        for (String[] cloth : clothes) {
            String category = cloth[1];
            clothingMap.put(category, clothingMap.getOrDefault(category, 0) + 1);
        }
        
        // 조합의 수        
        int answer = 1;
        for (int count : clothingMap.values()) {
            answer *= (count+1); //옷의종류가 경우의 수인데 
        }// 옷을 안입는거 까지 해야하기때문에 +1을 해야함
        
        return answer - 1;
    }
}