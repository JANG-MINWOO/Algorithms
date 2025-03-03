import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        Set<Integer> numSet = new HashSet<>();
        int canTake = nums.length / 2;
        
        for (int i = 0; i < nums.length; i++) {
            numSet.add(nums[i]);
        }
        
        if (numSet.size() < canTake) {
            answer = numSet.size();
        } else {
            answer = canTake;
        }
        return answer;
    }
}

// 1 1 1 1 1 2 2 3 4 4 일때는 5마리를 가져갈 수 있는데
// 1, 2, 3, 4 으로 4종류 밖에없음 그럴땐 4를 return 하고 종류가 5종류면 5를 return