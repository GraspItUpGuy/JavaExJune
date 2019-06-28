public class functions {
//    public      => visible to all
//    private     => visible to class
//    protected  =>  visible to the package and subclass

    public static void main(String[] agrs) {


        sayHello();
        System.out.println(minNum(5,19));
    }

    public static void sayHello() {
        System.out.println("Hello Java , whtacha doing ???");
    }

    public static int minNum(int a, int b) {
        int min= 0;
        if (a > b) {
            System.out.println("1st num is bigger");
            min = a;
        } else if (b > a) {
            System.out.println("2nd num is bigger");
            min = b;
        } else if (a == b) {
            System.out.println("numbers are equal");
            min = a;
        } else {
            System.out.println("invalid input");

        }
        return min;
    }
}