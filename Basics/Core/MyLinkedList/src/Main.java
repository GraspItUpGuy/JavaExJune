public class Main {
    public static void main(String[] args){

        Banker John = new Banker("John Doe",1232721);
        Banker Jane ;
        Jane  = John;
        Jane.setBalance(5.1);
        System.out.println(John.getBalance());
        System.out.println(Jane.getBalance());
    }
}
