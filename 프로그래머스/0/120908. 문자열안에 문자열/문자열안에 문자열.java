class Solution {
    public int solution(String str1, String str2) {
        int answer = 2;
        int length1 = str1.length();
        int length2 = str2.length();
        
        for (int i = 0; i < length1 - length2 + 1; i++) {
            String check = str1.substring(i, i + length2);
            if (check.equals(str2)) {
                answer -= 1;
                break;
            }
        }
        return answer;
    }
}

// abcdef -> index 0~5 length = 6
//     ab