class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        int[] RCJA = new int[4]; //성격유형 사전순으로 정렬하고 음수가 나오면 뒷 문자라고 판단
        int[] pointA = {3,2,1,0,-1,-2,-3};
        int[] pointB = {-3,-2,-1,0,1,2,3};

        for(int i = 0; i<choices.length; i++){
            int choice = choices[i]-1;
            if(survey[i].equals("RT")) RCJA[0] += pointA[choice];
            if(survey[i].equals("TR")) RCJA[0] += pointB[choice];
            if(survey[i].equals("CF")) RCJA[1] += pointA[choice];
            if(survey[i].equals("FC")) RCJA[1] += pointB[choice];
            if(survey[i].equals("JM")) RCJA[2] += pointA[choice];
            if(survey[i].equals("MJ")) RCJA[2] += pointB[choice];
            if(survey[i].equals("AN")) RCJA[3] += pointA[choice];
            if(survey[i].equals("NA")) RCJA[3] += pointB[choice];
        }
        if(RCJA[0]>=0) answer+="R";
        else answer+="T";
        
        if(RCJA[1]>=0) answer+="C";
        else answer+="F";
        
        if(RCJA[2]>=0) answer+="J";
        else answer+="M";
        
        if(RCJA[3]>=0) answer+="A";
        else answer+="N";
        
        return answer;
    }
}