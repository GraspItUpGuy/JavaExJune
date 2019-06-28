import java.util.Scanner;
public class CompareNums {
    public static void main(String[] args){

  Scanner input = new Scanner(System.in);

          int num1, num2 ;
        System.out.println("enter number 1 : ");
        num1 = input.nextInt();
        System.out.println("enter number 2 : ");
        num2 = input.nextInt();

        if(num1 > num2){
            System.out.println("Num1 is greater");
        }else if (num1 < num2){
            System.out.println("num2 is greater");
        }else if(num1 == num2){
            System.out.println("numbers are equal");
        }
    }
}
