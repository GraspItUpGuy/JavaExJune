import java.util.Scanner;
public class OddOrEven {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("even");
        for(int i =1; i<= 200 ; i++){
            if(i%2 == 0){
                System.out.print(i + " " );
            }
        }
        System.out.println(" ");
        System.out.println("odd");
        for(int i =1; i<= 200 ; i++){
            if(i%2 != 0){
                System.out.print(i + " " );
            }
        }
    }
}
