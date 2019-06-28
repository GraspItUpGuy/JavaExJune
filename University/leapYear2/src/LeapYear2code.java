import java.util.Scanner;

public class LeapYear2code
{
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        System.out.println("enter  year :");
        int year = input.nextInt();

        if(year % 400 ==0){
            System.out.println("it is a leap year");
        }else if((year % 4==0) &&(year %100 !=0)){
            System.out.println("It a a leap year");
        }else{
            System.out.println("NOt a leap year");
        }
    }
}
