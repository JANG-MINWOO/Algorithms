class Solution {
    public int[] solution(int brown, int yellow) {
        int area = brown + yellow;
        for(int height = 3; height <= Math.sqrt(area); height++) {
            if(area%height == 0) {
                int width = area/height;
                if((width-2)*(height-2)==yellow){
                    return new int[] {width, height};
                }
            }
        }
        return new int[0];
    }
}