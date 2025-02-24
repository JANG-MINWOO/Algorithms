class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int middle = 0;
        if (num % 2 == 0) {
            middle = (total + 1) / num;
        } else {
            middle = total / num;
        }
        
        if (num % 2 == 0) {
            // 총 인덱스가 6일때, 중간값 하나 아래(middle) = 길이 / 2 - 1, 25
            for (int i = 0; i < num; i++) {
                answer[i] = middle - (num / 2) + 1;
                middle++;
            }
        } else {
            for (int i = 0; i < num; i++) {
                answer[i] = middle - (num / 2);
                middle++;
            }
        }
        
        return answer;
    }
}
// num >= total 일때 result 에 음수가 포함됨