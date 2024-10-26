import java.util.Arrays;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] minPress = new int[26]; //알파벳 A-Z
        Arrays.fill(minPress, Integer.MAX_VALUE); //초기값은 무한대
        
        for(String keys : keymap){
            for(int i=0; i<keys.length();i++){
                char c=keys.charAt(i);
                minPress[c-'A'] = Math.min(minPress[c-'A'],i+1);
                //여기서 i+1 은 1-based index
            }
        }
        int[] answer = new int[targets.length];
        for(int i = 0; i < targets.length;i++){
            String target = targets[i];
            int pressCount = 0;
            
            for(char c : target.toCharArray()){
                if(minPress[c-'A']==Integer.MAX_VALUE){
                    pressCount=-1;
                    break;
                }
                pressCount += minPress[c-'A'];
            }
            answer[i]=pressCount;
        }
        return answer;
    }
}