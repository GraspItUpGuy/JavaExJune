public class insertionSort {
    public static void main(String[] args){

        int[] myArray = {34,2,17,54,29,18,0,1,13,56,72 };
        int[] sorted = InsertionSort(myArray);
        for(int i = 0; i<sorted.length;i++){
            System.out.print(sorted[i] + " ");
        }

    }// end of main
    public static int[] InsertionSort(int arr[]){

        int temp;
        // start loop from 1 for insertion sort
        for (int i = 1 ; i<arr.length; i++){
            for(int j=i; j>0; j--){
                if(arr[j]< arr[j-1]){
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1]= temp;

                }
            }
        }
        return arr;

    }
}
