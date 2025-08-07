package basic;

import java.util.Scanner;

public class Solutoin3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:- ");
        int n = sc.nextInt();

        long factorial = 1;
        for(int i=1;i<=n;i++){
            factorial = factorial * i;
        }

        System.out.println(factorial);
        sc.close();
    }    
}
