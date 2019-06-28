import java.util.Scanner;

public class crxPattern5 {
    public static void main(String[] args) {

//        int n=5;
//       // rows
//        for(int i = 0; i<n; i++){
//
//            // spaces
//            for(int j = n-i; j>=0; j--){
//                System.out.print(" ");
//            }
//
//            // column
//            for( int k = 0; k<=i; k++){
//                System.out.print("*");
//            }
//
//            System.out.println();



        Scanner input = new Scanner(System.in);
        System.out.println("enter nuber of rows");
        int n = input.nextInt();


//        for (int i = 0 ; i< rows ; i++){
//
//
//            for (int  j = rows-i ; j>=0 ; j-- ){
//                System.out.print(" ");
//            }
//
//            for ( int k=0 ; k<=i; k++){
//                System.out.print("*");
//            }
//            System.out.println();




        for(int i = 0; i<=n; i++){
            for (int j=n-i; j>=0; j--){
                System.out.print(" ");
            }

            for(int k=0; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }









    }
}
