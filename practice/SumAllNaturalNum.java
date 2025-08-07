// 9. Write a program to find sum of all natural numbers between 1 to n
package practice;

public class SumAllNaturalNum {
    public static void main(String[] args) {

        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
