public class TryCatchLec {
    public static void main(String[] args){


        try {
            int[] callArray = { 1,2,3};
            System.out.println(callArray[3]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("check index value : " + e);
        }

        System.out.println("program has been crashed almost");
    }
}
