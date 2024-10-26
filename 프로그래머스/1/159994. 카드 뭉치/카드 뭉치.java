import java.util.Arrays;
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        for(int i = 0 ; i < goal.length ; i++){
            if(cards1.length > 0 && goal[i].equals(cards1[0])){
                cards1 = Arrays.copyOfRange(cards1,1,cards1.length);
            }else if(cards2.length > 0 && goal[i].equals(cards2[0])){
                cards2 = Arrays.copyOfRange(cards2,1,cards2.length);
            }else{
                answer="No";
                break;
            }
        }
        return answer;
    }
}

//goal의 첫번째 인덱스가 card1 또는 card2 에 있는지 판단 후, 있다면 goal의 첫번째 인덱스 넘어가고
//두번째 인덱스 확인한다. 그리고 1,2 둘중 어디서 가져왔는지 확인후 1에서 가져왔다면 1의 맨앞인덱스를 삭제한다.
//만약 1,2 두 배열 모두에 goal 에 필요한 단어가 없다면 answer="No" 하고 끝