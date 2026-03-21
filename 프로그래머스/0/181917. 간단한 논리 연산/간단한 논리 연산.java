class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = false;
        boolean check1 = false;
        boolean check2 = false;
        
        if (x1 || x2) check1 = true;
        if (x3 || x4) check2 = true;
        if (check1 && check2) answer = true;
        return answer;
    }
}