public class BankApp {

    String name;
    int age;
    String taxDetail;
    double amount;

    //constructor
    public BankApp(String name){
        this.name = name;
        System.out.println("Constructor called");
    }

    // ask user for age
    public void accAge(int age){
        this.age = age;

    }
    // ask user for tax detail
    public void accTax(String taxDetail){
        this.taxDetail = taxDetail;
    }
    // ask user for amount
    public void accAmount(double amount){
        this.amount = amount;
    }

    public void  getUserInfo(){
        System.out.println("Name of user is :" + this.name);
        System.out.println("age of user is :" + this.age);
        System.out.println("Tax Details of user is :" + this.taxDetail);
        System.out.println("amount of user is :" + this.amount);
    }
}
