class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] binaryArr = new String[n];
        for (int i = 0; i < n; i++) {
            int result = arr1[i] | arr2[i]; 
            binaryArr[i] = Integer.toBinaryString(result);
            answer[i] = binaryArr[i].replace('1', '#').replace('0', ' ');
        }
        int length = 0;
        
        for (int i = 0; i < n; i++) {
            if (length < answer[i].length()) {
                length = answer[i].length();
            }
        } // 제일 긴 문자열의 길이를 판단
        
        for (int i = 0; i < n; i++) {
            if (answer[i].length() < length) {
                int gap = length - answer[i].length();
                for (int j = 0; j < gap; j++) {
                    answer[i] = " " + answer[i];
                }
            }
        }
        
        return answer;
    }
}