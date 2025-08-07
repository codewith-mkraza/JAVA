// 16. write a program to sum of its Digits
package practice;

public class PrintSumDigits {
    public static void main(String[] args) {
        int sum=0;
        int num=8765;
        while (num > 0) {
            int  reminder= num%10;
            sum=sum+reminder; 
            num = num/10;
        }
        System.out.println(sum);

    }
}

