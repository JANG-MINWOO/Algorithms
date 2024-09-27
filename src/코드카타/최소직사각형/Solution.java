package 코드카타.최소직사각형;

public class Solution {
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

        for (int[] size : sizes) {
            if (size[0] > rowMax) {
                rowMax = size[0];
            }
            if (size[1] > colMax) {
                colMax = size[1];
            }
        }
        return rowMax*colMax;
    }
}
//모든 명함을 가로로 눕힌다.
//가로와 세로에서 가장큰값을 찾는다.
//끝