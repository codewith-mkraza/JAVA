package Test;

public class Q15 {
    public static void main(String[] args) {
        int reverse = 0;
        int num = 987;
        while (num > 0) {
            int reminder = num % 10;
            reverse = reverse * 10 + reminder;
            num = num / 10;
        }
        System.out.println(reverse);
    }
}
