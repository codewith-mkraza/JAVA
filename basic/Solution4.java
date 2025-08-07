package basic;

public class Solution4 {
    public static void main(String[] args) {
        // for(int i=0;i<10;i++){
        //     System.out.println(i);
        // }

        int reverse = 0;

        // int j =0;
        // while(j<10){
        //     // code
        //     System.out.println(j);
        //     j++;
        // }

        int num = 543;  // initial value
        while(num != 0){
            int reminder = num%10;
            reverse = reverse*10 + reminder;
            num = num/10;   // increament ya decreament operator...
        }
        System.out.println(reverse);
    }
}
