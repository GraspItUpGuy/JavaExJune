public class SbiUser extends BankApp {

    public SbiUser(String name){
        super(name); // => similar to "this" but for interclass
        System.out.println("SBI new class constructor is called");
    }

}
