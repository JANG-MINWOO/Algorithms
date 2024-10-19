import java.util.Arrays;

class Solution {
    public int solution(int[][] sizes) {
        int rowMax=0;
        int colMax=0;
        for(int i=0;i<sizes.length;i++){
            if(sizes[i][0]<sizes[i][1]){
                int temp = sizes[i][0];
                sizes[i][0]=sizes[i][1];
                sizes[i][1]=temp;
            }
        } //모든 명함의 가로값을 크게만듬
        
        for(int i=0;i<sizes.length;i++){
            if(sizes[i][0]>rowMax){
                rowMax=sizes[i][0];
            }
            if(sizes[i][1]>colMax){
                colMax=sizes[i][1];
            }
        }
        return rowMax*colMax;
    }
}
//모든 명함을 가로로 눕힌다.
//가로와 세로에서 가장큰값을 찾는다.
//끝