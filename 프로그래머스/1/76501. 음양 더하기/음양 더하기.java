
class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        int[] arr = new int[absolutes.length];
        for(int i=0; i<absolutes.length;i++){
            if (signs[i]==true){
                arr[i]=absolutes[i];
            }else
                arr[i]=absolutes[i]*-1;
        }
        
        for(int i =0; i<absolutes.length;i++){
            answer+=arr[i];
        }
        
        
        return answer;
    }
}