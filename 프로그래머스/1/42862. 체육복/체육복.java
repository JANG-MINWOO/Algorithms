import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        //중복 set
        Set<Integer> set = new HashSet<>();
        //도난 queue
        Queue<Integer> que = new LinkedList<>();
        for(int l: lost){
            for(int r : reserve){
                if(l==r){
                    set.add(l);
                    break;
                }
            }
            que.offer(l);
        }
        
        int count =0;
        for(int r: reserve){
            if(set.contains(r)) continue;
            while(!que.isEmpty() && (que.peek()<r-1||set.contains(que.peek()))){
            que.poll();
            }
            if(!que.isEmpty() && que.peek()<=r+1){
            que.poll();
            count++;
            }
        }

        return n-lost.length+set.size()+count;
    }
}
