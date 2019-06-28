import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args){

//        String[] names = new String[10];
//        names[0] = "John Doe";
     //   System.out.println(names[0]);

        ArrayList<String> Heroes = new ArrayList<String>();
        Heroes.add("Hulk");
        Heroes.add("IronMan");
        Heroes.add("SpiderMan");
        Heroes.add(0,"Batman");
        for(int i=0; i<4; i++) {
            System.out.println("Heroes are " + Heroes.get(i));
        }


    }
}
