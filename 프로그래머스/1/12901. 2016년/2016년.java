class Solution {
    public String solution(int a, int b) {
        int[] days = {31,29,31,30,31,30,31,31,30,31,30,31};
        String[] dayOfWeek = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int totaldays = 0;
        for(int i = 0; i < a-1 ;i++){
            totaldays+=days[i];
        }
        totaldays+=b-1;
        String answer = dayOfWeek[totaldays%7];
        return answer;
    }
}