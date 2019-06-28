public class BankUser {
    public static void main(String[] args){

        BankApp John = new BankApp("John Doe");
        John.accAge(35);
        John.accTax("JD-XX161717");
        John.accAmount(30000);
        John.getUserInfo();

        System.out.println();

        BankApp Jane = new BankApp("Jane Doe");
        Jane.accAge(45);
        Jane.accTax("JD-XX1fwf61717");
        Jane.accAmount(3000000);
        Jane.getUserInfo();


    }
}
