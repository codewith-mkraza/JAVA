package practice;

public class PrintStrongOrNot {
    public static void main(String[] args) {
        for (int num = 1; num <= 100000; num++) {
            int tempNum = num;
            int sum = 0;
            while (tempNum != 0) {
                int reminder = tempNum % 10;
                tempNum = tempNum / 10;
                int factorial = 1;
                for (int i = 1; i <= reminder; i++) {
                    factorial = factorial * i;
                }

                sum = sum + factorial;
            }
            if (num == sum) {
                System.out.println(num+" is a strong number...");
            }
        }

    }
}
