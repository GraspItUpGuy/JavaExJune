public class pattern15 {
    public static void main(String[] args){

        int n=5;


        for(int i=0; i<2*n-1; i++ ){

            if(i<=n-1){
                for(int j=0; j<2*i; j++){
                    System.out.print("   ");
                }
                for(int k=0; k<n-i; k++){
                    System.out.print(" * ");
                }
                System.out.println();
            }else if(i>=n-1){



            }else{
                System.out.println("something went wrong");
            }

        }



    }
}
