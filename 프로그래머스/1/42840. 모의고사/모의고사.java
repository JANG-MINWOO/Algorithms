import java.util.ArrayList;
import java.util.List;
class Solution {
    public int[] solution(int[] answers) {
        int[] one = {1,2,3,4,5};
        int[] two = {2,1,2,3,2,4,2,5};
        int[] three = {3,3,1,1,2,2,4,4,5,5};
        int cnt1 = 0 ,cnt2 = 0,cnt3 = 0;
        for(int i = 0; i<answers.length;i++){
            if(one[i%one.length]==answers[i]) cnt1++;
            if(two[i%two.length]==answers[i]) cnt2++;
            if(three[i%three.length]==answers[i]) cnt3++;
        }
        int maxScore = Math.max(cnt1, Math.max(cnt2, cnt3));
        List<Integer> result = new ArrayList<>();
        if(cnt1==maxScore) result.add(1);
        if(cnt2==maxScore) result.add(2);
        if(cnt3==maxScore) result.add(3);
        
        return result.stream().mapToInt(i -> i).toArray();
    }
}

// 1번수포자 : 1,2,3,4,5~, 2번수포자: 2,1,2,3,2,4,2,5~ 3번수포자: 3,3,1,1,2,2,4,4,5,5~