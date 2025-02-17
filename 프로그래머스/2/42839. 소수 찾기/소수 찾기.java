import java.util.*;

class Solution {
    Set<Integer> numberSet = new HashSet<>();
    
    public int solution(String numbers) {
        int count = 0;
        generatePermutations("", numbers);
        
        for (int num : numberSet) {
            if(isPrime(num)) count++;
        }
        return count;
    }
    
    private boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
    
    private void generatePermutations(String current, String remaining) {
        if (!current.isEmpty()) {
            numberSet.add(Integer.parseInt(current));
        }
        
        for (int i = 0; i < remaining.length(); i++) {
            generatePermutations(current + remaining.charAt(i),
                                remaining.substring(0,i) + remaining.substring(i+1));
        }
    }
}