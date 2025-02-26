class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        for (String str : babbling) {
            int ayaCount = 0;
            int yeCount = 0;
            int wooCount = 0;
            int maCount = 0;
            while (!str.isEmpty()) {

                if (str.length() >= 3 && str.substring(0, 3).equals("aya")) {
                    str = str.substring(3);
                    ayaCount++;
                } else if (str.length() >= 2 && str.substring(0, 2).equals("ye")) {
                    str = str.substring(2);
                    yeCount++;
                } else if (str.length() >= 3 && str.substring(0, 3).equals("woo")) {
                    str = str.substring(3);
                    wooCount++;
                } else if (str.length() >= 2 && str.substring(0, 2).equals("ma")) {
                    str = str.substring(2);
                    maCount++;
                } else {
                    break;
                }
            }
            
            if (str.isEmpty() && ayaCount <= 1 && maCount <= 1 && wooCount <= 1 && yeCount <= 1) answer++;
        }
        
        return answer;
    }
}