public class StarPattern {
    public static void main(String[] args){
        // Pattern 1
        System.out.println("Pattern 1");
        for(int i=0; i<5 ; i++){
           for (int j=0; j<=i; j++){
               System.out.print("*");
           }
            System.out.println("");
        }

        // pattern 2
        System.out.println("Pattern 2");
        for (int i=5; i>0 ; i-- ){
            for(int j=i ; j>0 ; j--){
                System.out.print("*");
            }
            System.out.println("");
        }

        // pattern 3
        System.out.println("pattern 3");
        for (int i=5; i>0 ; i-- ) {
            for (int j = 0; j < i; j++) {
                System.out.print(j + 1);
            }
            System.out.println("");
        }
    }
}
