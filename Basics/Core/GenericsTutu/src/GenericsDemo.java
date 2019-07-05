import java.util.ArrayList;

public class GenericsDemo {
    public static void main(String[] args){
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(23);
        arrayList.add(24 );
        arrayList.add(25);
        arrayList.add(26);

        for(Object i : arrayList){
            System.out.println(i);
        }

    }
}
