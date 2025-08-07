// 15. write a program to reverse the given Digits
package practice;

public class PrintReverseRemin {
    public static void main(String[] args) {
        // int reverse=0;
        // int num=98765;
        // while(num !=0){
        // int reminder= num%10;
        // reverse= reverse*10 + reminder;
        // num = num/10;
        // }
        // System.out.println(reverse);
    //     int reverse = 0;
    //     int num = 765;
    //     while (num != 0) {
    //         int reminder = num % 10;
    //         reverse = reverse * 10 + reminder;
    //         num = num / 10;
    //     }
    //     System.out.println(reverse);
          int reverse=0;
          int num=123456;
          while(num !=0){
            int reminder = num%10;
            reverse = reverse* 10+ reminder;
            num=num/10;

              
          }
          System.out.println(reverse);
    }
}
