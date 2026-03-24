import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

class Solution {
    public int solution(int a, int b, int c, int d) {
        if (a == b && b == c && c == d) return a * 1111;
        
        int[] arr = new int[] {a, b, c, d};
        Set<Integer> set = new HashSet<>();
        set.add(a); 
        set.add(b); 
        set.add(c); 
        set.add(d);
        Arrays.sort(arr);
        
        if (set.size() == 2 && arr[1] == arr[2]) { //세주사위 같음 + 1개만 다를때
            if (arr[2] == arr[3]) return (int) Math.pow((arr[3] * 10 + arr[0]), 2); //제곱하여 리턴, 1333 꼴일때
            else if (arr[0] == arr[1]) return (int) Math.pow((arr[0] * 10 + arr[3]), 2); //1113 꼴일떄
        }
        
        if (set.size() == 2 && arr[1] != arr[2]) { //두 주사위 + 두 주사위 같을떄
            int abs = Math.abs(arr[1] - arr[2]);
            return (arr[1] + arr[2]) * abs;
        }
        
        if (set.size() == 3) {
            if (arr[0] == arr[1]) return arr[2] * arr[3];
            else if (arr[1] == arr[2]) return arr[0] * arr[3];
            else if (arr[2] == arr[3]) return arr[0] * arr[1];
        }
        
        if (set.size() == 4) return arr[0];
        
        return 0;
    }
}