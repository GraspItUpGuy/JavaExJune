import java.util.ArrayList;

public class ArrayListAdvance {

    public static void main (String[] args){
        ArrayList<String> myArrList = new ArrayList<String>();

        // Arraylist requires us to pass modern data types instead of primitive data types
        // hence we pass Integer (not integer) and Double (not double)
        // values set in modern datatypes => autoboxing
        // retriving values in modern datatypes => unboxing

        ArrayList<Integer> myNewArrList = new ArrayList<Integer>();

        for (int i=0; i<20; i++){
            myNewArrList.add(Integer.valueOf(i));   // Autoboxing
            // add using  Modern data types
        }

        for(int i=0; i<20; i++){
            System.out.println("values are : " + myNewArrList.get(i).intValue()); // unboxing
        }
    }
}
