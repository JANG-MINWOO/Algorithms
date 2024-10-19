import java.util.Arrays;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score); // 오름차순으로 먼저 정렬해놓고
        int namoji = score.length%m; //남는 사과가 있나 확인
        if(namoji != 0){
            score=Arrays.copyOfRange(score,namoji,score.length);//score 에 안쓰는 사과는 제외
        }
        for(int i = 0 ; i<score.length-m+1;i+=m){
            answer+=score[i];
        }
        return answer*m;
    }
}

// 1. score의 길이를 m 으로 나누면 몇박스인지와 나머지가 몇인지 나오고, 나머지만큼 제일 품질이나쁜 사과는 안넣는것으로 한다.
// 2. 품질이 제일 나쁜 사과 순서대로 박스를 만든다.
// 3. 1번박스부터 끝박스까지의 점수 합을 return 한다.

//위의 내용을 score를 오름차순으로 정렬하고 하면 편할 것 같다.