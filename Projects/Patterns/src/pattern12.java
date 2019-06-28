public class pattern12 {
    public static void main(String[] args){

        int n=5;


        for(int i =0 ; i<n; i++){
            for(int j=0; j<2*n-1 ; j++) {
                if(  i+j< n-1 ){
                    System.out.print("   ");
                }else if( i+j > 2*i + 4 ){
                    System.out.print("   ");
                } else if(((i+j) ==n) || ((i+j) ==n+2) || (i+j)==2*n-1 || (i+j)==2*n+1){
                    System.out.print(" ! ");
                }else{
                    System.out.print(" * ");
                }

            }
            System.out.println();
        }

    }
}
