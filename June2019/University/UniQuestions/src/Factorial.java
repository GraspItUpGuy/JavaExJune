import java.util.Scanner;

public class Factorial {
    public static void main(String args[]){

        Scanner input =  new Scanner(System.in);


        System.out.println("enter number greater than 0 ");
        int num = input.nextInt();
        if(num == 0){
            System.out.println("Can't find factorial of integer less than 1");
        }else {
            int fact = 1;
            for (int i = num; i > 0; i--) {
                fact = fact * i;
            }

            System.out.println("Factorial is " + fact);
        }
    }


}
