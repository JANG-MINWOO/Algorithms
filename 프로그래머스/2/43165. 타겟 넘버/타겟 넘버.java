class Solution {
    int count = 0; // 가능한 경우의 수를 저장할 변수

    public int solution(int[] numbers, int target) {
        dfs(numbers, target, 0, 0);
        return count;
    }

    private void dfs(int[] numbers, int target, int depth, int sum) {
        // 모든 숫자를 사용한 경우 (종료 조건)
        if (depth == numbers.length) {
            if (sum == target) {
                count++; // 타겟 넘버와 일치하면 카운트 증가
            }
            return;
        }

        // 현재 숫자를 더하는 경우
        dfs(numbers, target, depth + 1, sum + numbers[depth]);
        // 현재 숫자를 빼는 경우
        dfs(numbers, target, depth + 1, sum - numbers[depth]);
    }
}