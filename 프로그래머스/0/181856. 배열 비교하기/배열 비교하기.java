class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int sum1 = 0, sum2 = 0;
        int length1 = arr1.length;
        int length2 = arr2.length;
        
        if (length1 > length2) {
            return 1;
        } else if (length1 < length2) {
            return -1;
        }
        
        if (length1 == length2) {
            for (int i = 0; i < length1; i++) {
                sum1 += arr1[i];
                sum2 += arr2[i];
            }
            
            if (sum1 > sum2) {
                return 1;
            } else if (sum1 < sum2) {
                return -1;
            }
        }
        
        
        return answer;
    }
}