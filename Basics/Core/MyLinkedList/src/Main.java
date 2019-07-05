import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args){
//
//        Banker John = new Banker("John Doe",1232721);
//        Banker Jane ;
//        Jane  = John;
//        Jane.setBalance(5.1);
//        System.out.println(John.getBalance());
//        System.out.println(Jane.getBalance());

        ArrayList<Integer> myIntList = new ArrayList<>();
        myIntList.add(5);
        myIntList.add(6);
        myIntList.add(7);
        myIntList.add(8);
        myIntList.add(9);
        for(int i=0; i<myIntList.size(); i++){
            System.out.println(i + "-----" + myIntList.get(i));
        }
        myIntList.add(1,32);
        System.out.println();
        for(int i=0; i<myIntList.size(); i++) {
            System.out.println(i + "-----" + myIntList.get(i));

        }

        // linkedList example here
        LinkedList<String> programming = new LinkedList<>();
        programming.add("c");
        programming.add("Java");
        programming.add("javascript");
        programming.add("python");


        programming.add(1,"Flutter");
        pLinkList(programming);


    }
    public static void pLinkList(LinkedList<String> ll){
        //Iterators
        Iterator<String> i = ll.iterator();
        while(i.hasNext()){
            System.out.println("Your fav programming language is " + i.next());
        }
    }
}
