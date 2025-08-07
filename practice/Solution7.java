// 21. Write a program to find number and sum of all integer between 100 and 200 which are divisible by 9
package practice;

public class Solution7 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 100; i <= 200; i++) {
            if (i % 9 == 0) {
                sum = sum + i;
                System.out.println(i);
            }

        }
        System.out.println(sum);
    }

}
