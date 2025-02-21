class Solution {
    public int solution(int[] numbers, int k) {
        int current = 0;
        int count = 0;
        int index = 0;
        
        while (count != k) {
            count++;
            current = numbers[index];
            index += 2;
            if (index > (numbers.length - 1)) {
                index -= numbers.length; 
            }
        }
        return current;
    }
}