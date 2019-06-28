import java.util.Scanner;
public class Leap {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = input.nextInt();
        if((year%400 == 0) || (year %4 ==0  && year%100 !=0)){
            System.out.println("it is a leap year");
        }else{
            System.out.println("not a leap year");
        }

    }
}
