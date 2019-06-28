import java.util.Scanner;

public class Variables {
    public static void main (String[] args){

        // input from user
        int num1, num2, sum=0 ;

        Scanner input = new Scanner(System.in);
        System.out.println("enter number 1");
        num1 = input.nextInt() ;
        System.out.println("enter number 2");
        num2 = input.nextInt() ;
        sum = num1 + num2 ;
        System.out.println("sum is : " + sum);

    }
}
