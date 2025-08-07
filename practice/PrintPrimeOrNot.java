// 17. write a program to Check Whether a Given Number is Prime or Not
package practice;

import java.util.Scanner;

public class PrintPrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n = sc.nextInt();
       int count=0;
        for(int i=1;i<=n;i++){
            if (n%i==0) {
                count++; 
            }
        }
        if(count==2){
            System.out.println("N is a Prime Number");
        }
        else{
            System.out.println("N is Not a Prime Number");
        }

        sc.close();
      
    }
}
