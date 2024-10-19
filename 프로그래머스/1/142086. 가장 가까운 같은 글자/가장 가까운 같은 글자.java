class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        String[] str = s.split(""); //잘라서 String 배열에 넣음
        for(int i=0;i<s.length();i++){ //String 길이만큼 실행
            if(i==0) {answer[i]=-1;} //첫 문자는 반드시 -1
            else { //두번째문자부터는 아래대로
                int j=i-1;
                int cnt = 1;
                while(!str[i].equals(str[j])){ //1번째 인덱스를 비교할땐 str[1]이랑 str[0] 이랑 비교함
                    j--; //비교할 애를 앞인덱스로보내주고 j=0 일때 들어오면 j=-1이됨
                    cnt++; //카운트는 1이됨
                    if(j==-1){
                            answer[i]=-1;
                            break;
                    }
                }
                if(j>=0){
                    answer[i]=cnt;
                }
            }
        }
        return answer;
    }
}