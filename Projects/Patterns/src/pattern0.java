import java.util.Scanner;

public class pattern0 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter rows : ");
        int n = input.nextInt();

        for(int i=0 ; i<n ; i++){
            System.out.println("*");
        }

    }
}
