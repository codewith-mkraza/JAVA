package basic;

import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Age:- ");
        int age = sc.nextInt();

        if(age >= 18){
            System.out.println("You can drive...");
        }else{
            System.out.println("You can't drive...");
        }
        
        sc.close();
    }
}

