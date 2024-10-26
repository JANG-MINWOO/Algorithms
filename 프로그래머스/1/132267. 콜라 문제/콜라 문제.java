class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int nowBottle=0;
        while(n>=a){
            answer+=(n/a)*b; //처음엔 10 들어감, 두번째엔 5들어감, 세번째엔 2들어감, 네번째엔 1 들어감
            nowBottle=n%a+(n/a)*b; //지금 병도 10 들어감, 지금병도 5 들어감, 지금병은 3들어감, 지금병은 2 들어감
            n=nowBottle; //시작병을 들어간 10으로 바꿈, 시작병을 5로 바꿈 시작병을 3병으로 바꿈, 시작병을 2로 바꿈
            nowBottle=0; //지금 가진병을 0 으로 초기화
        }

        return answer;
    }
}

//현재 가진 빈병/교환병수 를 하면 새로 받을수 있는 병이 나오고, 나머지 교환못한 병과 새로받은병을 합해서 나눠가기
//4병을 가져가면 1병을 받을수 있다고 했을때, 7병을 가지고 간경우에는 1병을받고 3병이 남기때문에 한번더 먹는것이 가능