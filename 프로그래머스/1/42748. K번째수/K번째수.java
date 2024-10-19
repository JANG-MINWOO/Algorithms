import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i=0;i<commands.length;i++){
            int start = commands[i][0];
            int end = commands[i][1];
            int[] arr1 = Arrays.copyOfRange(array,start-1,end);
            Arrays.sort(arr1);
            
            answer[i]= arr1[commands[i][2]-1] ;
        }

        return answer;
    }
}