class Solution {
    public int solution(int[] arr) {
        int lcm = arr[0];
        
        for (int i = 1; i<arr.length; i++) {
            lcm = calculateLCM(lcm,arr[i]);
        }
        
        return lcm;
    }
    
    
    private int calculateGCD(int a, int b) {
        if (b == 0) return a;
        return calculateGCD(b, a % b);
    }
    
    private int calculateLCM(int a, int b) {
        return a*(b/calculateGCD(a,b));
    }
}