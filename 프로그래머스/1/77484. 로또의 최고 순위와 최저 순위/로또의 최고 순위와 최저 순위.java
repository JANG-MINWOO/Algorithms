class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int winCount = 0;
        int zeroCount = 0;
        
        for(int i=0;i<lottos.length;i++){
            if(lottos[i]==0){
                zeroCount++;
                continue;
            }
            for(int j=0;j<win_nums.length;j++){
                if(lottos[i]==win_nums[j]){
                    winCount++;
                }
            }
        }
        if(winCount+zeroCount>1){
            answer[0]= 7-winCount-zeroCount;
        }else{
            answer[0]=6;
        }
        
        if(winCount>1){
            answer[1]=7-winCount;
        }else{
            answer[1]=6;
        }
        
        return answer;
    }
}

//lottos 의 원소가 0이라면 zerocount 증가, 아니라면 비교로 넘어가기
//lottos 랑 win_nums 랑 하나씩 비교해서 일치할때마다 카운트 1증가