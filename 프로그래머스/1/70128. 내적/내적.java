import java.util.stream.IntStream;

class Solution {
    public int solution(int[] a, int[] b) {
        int answer;
        return answer= IntStream.range(0,a.length).map(i->a[i]*b[i]).sum();
    }
}