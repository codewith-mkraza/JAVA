// 20. Write a program to enter the numbers till the user wants and at the end the program should display the largest and smallest numbers entered
package practice;

import java.util.Scanner;

public class PrintLargeSmall {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        char ch;
        int largest=0;
        int small=0;
        do{
            System.out.print("Enter number:- ");
            int num = sc.nextInt();
            if (num > largest) {
                largest++;
            } 
            
            if(num < small){
                small++;
            }
            System.out.print(" enter again(Y/N):- ");
            ch = sc.next().charAt(0);
        }while(ch == 'Y' || ch =='y');

        System.out.println("Largest"+largest);
        System.out.println("Small:- "+small);
        sc.close();
    }
        
    }

