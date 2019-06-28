import java.util.ArrayList;

public class ArrayListRev {
    public static void main(String args[]) {

//        String[]  StringArray = new String[10];
//        StringArray[0] = "Delhi";
//        System.out.println(StringArray[0]);


        // Array List

        ArrayList<String> Heroes = new ArrayList<String>();
        Heroes.add("IronMan");
        Heroes.add("Thor");
        Heroes.add("Hulk");
        Heroes.add(0,"Rabbit");
        System.out.println("My Favourite super hero is " + Heroes.get(0));
        for(int i=0; i<=Heroes.size();i++){
            System.out.println(Heroes.get(i));
        }

    }
}