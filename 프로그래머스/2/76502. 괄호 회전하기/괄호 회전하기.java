import java.util.*;

class Solution {
    public int solution(String s) {
  int count = 0;
        int n = s.length();
        
        for (int i = 0; i < n; i++) {
            String rotated = s.substring(i) + s.substring(0, i); // 왼쪽으로 i칸 회전
            if (isValid(rotated)) {
                count++;
            }
        }
        
        return count;
    }
    
    private boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                    (c == ']' && top != '[') ||
                    (c == '}' && top != '{')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}