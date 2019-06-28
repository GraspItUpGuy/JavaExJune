import java.util.Scanner;

public class FactorialWrec {
    public static void main (String args[]){
     Scanner input  = new Scanner(System.in);
        System.out.println("enter number greater than 0");
        int num = input.nextInt();
       int FactOfNum =   Fact(num);
        System.out.println("Factorial is " + FactOfNum);


    }
    public static int Fact(int n){
        int factorial = n * (n-1);
        Fact(n-1);
        return factorial;
    }
}
