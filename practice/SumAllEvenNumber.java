// 10. Write a program to find sum of all even numbers between 1 to n
package practice;

public class SumAllEvenNumber {
   public static void main(String[] args) {
    int sum=0;
    for(int i=1;i<=10;i++){
        if(i%2==0){
            sum=sum+i;
        }
    }
    System.out.println(sum);
   } 
}
