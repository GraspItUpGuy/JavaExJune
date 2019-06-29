public class SbiUser extends BankApp {

    public SbiUser(String name){
        super(name); // => similar to "this" but for interclass
        System.out.println("SBI new class constructor is called");
    }

    // sbi user can now use only this function
    @Override
    public void getUserInfo() {
        super.getUserInfo();
        System.out.println("Tax details are : " + taxDetail);
    }
}

// can only inherit in multilevel in java => not in multiple usimg ,

// multilevel inheritence
public class  NewBank extends BankApp{
    public NewBank(String name){
        super(name);
    }
}

