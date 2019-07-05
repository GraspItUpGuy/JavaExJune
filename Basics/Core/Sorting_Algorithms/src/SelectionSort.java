public class SelectionSort {
    public static void main(String[] args){

        int[] myArray = {10,4,5,7,29,59,54,45,1,0};
        int Sorted[] = seletionSort(myArray);
        for (int i=0; i<Sorted.length; i++){
            System.out.print(Sorted[i] + " ");
        }


    }// end of main

    public static int[] seletionSort(int[] arr){
        for (int i=0; i<arr.length - 1; i++ ){
            int index = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]<arr[index]){
                    index = j;
                }

            }
            int small = arr[index];
            arr[index] = arr[i];
            arr[i] = small;
        }
        return arr;
    }

}
