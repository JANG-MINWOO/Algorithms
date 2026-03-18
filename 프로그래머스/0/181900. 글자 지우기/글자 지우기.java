import java.util.Arrays;

class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuilder sb = new StringBuilder();
        Arrays.sort(indices);
        for(int i = 0; i < my_string.length(); i++) {
            if (Arrays.binarySearch(indices, i) < 0) sb.append(my_string.charAt(i));
        }
        return sb.toString();
    }
}