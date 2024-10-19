class Solution {
    public int solution(int n) {
        String trit="";
        while(n!=0){
            trit+=n%3;
            n/=3;
        }
        return Integer.parseInt(trit,3);
    }
}