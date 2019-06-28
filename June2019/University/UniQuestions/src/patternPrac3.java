import java.util.Scanner;

public class patternPrac3 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int n=5;
        for(int i = 0; i<n; i++){
            for(int j= 1; j<=n-i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

}
