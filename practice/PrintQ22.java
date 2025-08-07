package practice;


public class PrintQ22 {
    public static void main(String[] args) {
        int num = 145;
        int tempNum = num;
        int sum = 0;
        while(tempNum != 0){
            int reminder = tempNum % 10;
            tempNum = tempNum/10;
            int factorial = 1;
            for(int i=1;i<= reminder;i++){
                factorial = factorial *i;
            }

            sum = sum + factorial;
        }

        if(tempNum == sum){
            System.out.println("Strong number...");
        }else{
            System.out.println("Not a strong number...");
        }
    }
}
