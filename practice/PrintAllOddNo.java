// 8. Write a program to print all odd number between 1 to 100
package practice;

public class PrintAllOddNo {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            if(i%2==1){
                System.out.println(i);
            }
        }
    }
}
