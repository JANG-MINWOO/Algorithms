import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String answer = "";
        
        if (n % 2 == 0) {
            answer = "even";
        } else {
            answer = "odd";
        }
        System.out.print(n + " is " + answer);
    }
}