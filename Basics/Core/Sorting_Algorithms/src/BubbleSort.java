public class BubbleSort {
    public static void main(String[] args){

        int[] input = {13,4,7,2,8,34,21,87,12,0,10,1,2,3,4,5,6,7,8,9};
        bubbleSort(input);
    }
    private static void  printNum(int[] input){
        for(int i =0; i<input.length; i++){
            System.out.print(input[i] + ",");
        }
        System.out.println("\n");
    }

    private static void swapMe(int i, int[] array){
        int temp;
        temp = array[i];
        array[i] = array[i+1];
        array[i+1] = temp;

    }
    public static void bubbleSort(int[] array){
        int n = array.length;



        for(int m = n; m>=0; m--){
            for(int i=0; i<n-1; i++){

                if(array[i] > array[i+1]){
                    swapMe(i,array);
                }
            }
            printNum(array);
        }

    }
}
