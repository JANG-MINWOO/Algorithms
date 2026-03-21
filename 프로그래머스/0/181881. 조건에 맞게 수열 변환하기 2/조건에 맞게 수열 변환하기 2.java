import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        while (true) {
            int[] arrTemp = Arrays.copyOf(arr, arr.length);
            answer++;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] /= 2;
                } else if (arr[i] < 50 && arr[i] % 2 != 0){
                    arr[i] = arr[i] * 2 + 1;
                }
            }
            boolean a = true;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != arrTemp[i]) a = false;
            }
            if (a) return answer - 1;
        }
    }
}