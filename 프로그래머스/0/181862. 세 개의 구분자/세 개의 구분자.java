class Solution {
    public String[] solution(String myStr) {
        myStr = myStr.replace("a", " ");
        myStr = myStr.replace("b", " ");
        myStr = myStr.replace("c", " ");
        myStr = myStr.replaceAll(" +", " ");
        myStr = myStr.trim();
        
        String[] answer = myStr.split(" ");
        if (answer[0].isEmpty()) answer[0] = "EMPTY";
        return answer;
    }
}