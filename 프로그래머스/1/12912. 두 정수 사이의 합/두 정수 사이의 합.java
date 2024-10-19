import java.lang.Math;
class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        long length = Math.abs(a-b)+1;
        if(a==b){
            answer=a;
        }else if (a>b){
            for(int i=0; i<length; i++){
                answer+=i+b;
            }
        }else if (a<b){
            for(int i=0; i<length; i++)
                answer+=i+a;
            }
                return answer;
        }

    }