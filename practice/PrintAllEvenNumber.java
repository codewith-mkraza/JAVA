// 7. Write a program to print all even numbers between 1 to n
package practice;

import java.util.Scanner;

public class PrintAllEvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number til you want sum:- ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i%2==0){
                System.out.println(i);
            }
        } 

        sc.close();
    }
}