class Solution {
    public String solution(int[] food) {
        String answer = "";
        int cnt=0;
        for (int i=1;i<food.length;i++){
            cnt=food[i]/2;
            for(int j=0;j<cnt;j++){
                answer+=i;
            }
        }
        String reverse = new StringBuilder(answer).reverse().toString();

        return answer + 0 + reverse;
    }
}