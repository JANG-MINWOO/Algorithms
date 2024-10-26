class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String string = ""+x;
        int sum=0;
        String[] str = string.split(""); //쪼개서 문자열에 넣기
        for(String s: str)
            sum+=Integer.parseInt(s);
        if(x%sum==0){
            answer=true;
        }else answer=false;
        return answer;
    }
}