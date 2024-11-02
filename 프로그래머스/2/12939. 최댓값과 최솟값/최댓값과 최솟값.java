import java.util.Arrays;
class Solution {
    public String solution(String s) {
        String answer = " ";
        int[] numbers = Arrays.stream(s.split(" "))
                              .mapToInt(Integer::parseInt)
                              .toArray();
        int min = Arrays.stream(numbers).min().getAsInt();
        int max = Arrays.stream(numbers).max().getAsInt();
        return min+answer+max;
    }
}