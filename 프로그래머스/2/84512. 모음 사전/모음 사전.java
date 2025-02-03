class Solution {
    public int solution(String word) {
        int answer = 0;
        
        int[] multiplier = new int[6];
        multiplier[5] = 1;
        
        for (int i = 4; i >= 0; i--) {
            multiplier[i] = multiplier[i+1] * 5 + 1;
        }
        
        String vowels = "AEIOU";
        
        for (int i = 0; i < word.length(); i++) {
            int idx = vowels.indexOf(word.charAt(i));
            answer += idx * multiplier[i+1] + 1;
        }
        return answer;
    }
}