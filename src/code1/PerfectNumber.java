package code1;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        int n;
        int sum = 0;
        
  
        System.out.print("Enter any number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i; 
            }
        }
        
        if (n == sum) {
            System.out.println(n + " is a Perfect Number.");
        } else {
            System.out.println(n + " is Not a Perfect Number.");
        }

        sc.close();
    }
}
