class Solution {
    public int solution(String[] babbling) {
        String[] canPronounce = {"aya", "ye", "woo", "ma"};
        int answer = 0;
        
        for (String word : babbling) {
            boolean isValid = true;

            // 연속 발음 방지: 같은 발음이 연속해서 나오는 경우를 체크
            for (String pronounce : canPronounce) {
                if (word.contains(pronounce.repeat(2))) {
                    isValid = false;
                    break;
                }
            }

            // 발음 가능한 단어들로만 이루어진 경우인지 체크
            if (isValid) {
                // 정규식 사용하여 정확히 발음이 조합된 것인지 확인
                String regex = "^(aya|ye|woo|ma)+$";
                if (word.matches(regex)) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}