public class pattern14 {
    public static void main(String[] args){

        int n=5;


        for(int i=0; i<=(2*n)-1; i++){
            for(int j=0; j<n; j++) {
               if(i+j<=(n/2)+1) {
                   System.out.print("   ");
               }else if(i-j>=n-1){
                    System.out.print("   ");
                }else{
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }




    }

}
