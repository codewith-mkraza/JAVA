package basic;

import java.util.Scanner;

public class Solution6 {

    public static void main(String[] args) {
        // for(int i=0;i<10;i++){
        //     System.out.println(i);
        // }

        // int j=0;
        // while(j<10){
        //     System.out.println(j);
        //     j++;
        // }

        Scanner sc = new Scanner(System.in);
        char ch;
        int pos = 0;
        int neg = 0;
        int zero = 0;
        do{
            System.out.print("Enter number:- ");
            int num = sc.nextInt();
            if (num > 0) {
                pos++;
            } 
            
            if(num < 0){
                neg++;
            }

            if(num == 0){
                zero++;
            }
            System.out.print("Do you want to enter again(Y/N):- ");
            ch = sc.next().charAt(0);
        }while(ch == 'Y' || ch =='y');

        System.out.println("Possitive:- "+pos);
        System.out.println("Negative:- "+neg);
        System.out.println("Zero:- "+zero);
        sc.close();
    }
}