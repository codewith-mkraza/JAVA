// 18. Write a program to calculate HCF of Two given number
package practice;

import java.util.Scanner;

public class PrintHCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a First Number");
        int firstNumber = sc.nextInt();
        System.out.println("Enter a Second Number");
        int secondNumber = sc.nextInt();
        int max = 0;
        if (firstNumber > secondNumber) {
            max = firstNumber;
        } else {
            max = secondNumber;
        }
        int hcf = 1;
        for (int i = 1; i <= max; i++) {
            if (firstNumber % i == 0 && secondNumber % i == 0) {
                hcf = i;
            }
        }
        System.out.println(hcf);
        sc.close();
    }
}
