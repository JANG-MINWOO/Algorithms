class Solution {
    int count = 0;
    public int solution(int[] numbers, int target) {
        dfs(numbers, target, 0, 0);
        return count;
    }
    
    private void dfs(int[] numbers, int target, int depth, int sum) {
        //종료조건 설정
        if (depth == numbers.length) {
            if (sum == target) {
                count++;
            }
            return;
        }
        
        dfs(numbers, target, depth + 1, sum + numbers[depth]);
        dfs(numbers, target, depth + 1, sum - numbers[depth]);
    }
}