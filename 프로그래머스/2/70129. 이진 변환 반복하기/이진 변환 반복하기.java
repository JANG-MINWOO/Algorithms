class Solution {
    public int[] solution(String s) {
        int removeCount = 0;
        int repeatCount = 0;
        
        while(!s.equals("1")) {
            int beforeLength = s.length();
            s = s.replace("0","");
            int afterLength = s.length();
            
            removeCount += (beforeLength-afterLength); // 처음 이진변환 할 때 몇개의 0을 제거했는지 파악
            s = toBinary(afterLength);
            repeatCount++;
        }
        
        return new int[] {repeatCount, removeCount};
    }
    
    public String toBinary(int number) {
        StringBuilder binary = new StringBuilder();
        while (number > 0) {
            binary.insert(0, number % 2);  // 2로 나눈 나머지를 맨 앞에 추가
            number /= 2;  // 2로 나누어 다음 자릿수를 계산
        }
        return binary.length() > 0 ? binary.toString() : "0";  // 0일 경우 "0" 반환
    }
}

//1+2+