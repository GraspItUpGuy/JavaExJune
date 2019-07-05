class Banker{
    private String name ;

    public Banker(String name) {
        this.name = name;
    }
    public String greet(){
        return "Default greetings";
    }

}

class SBI extends Banker{
    public SBI(String name) {
        super(name);
    }

    @Override
    public String greet() {
        return "Welcome to SBI";
    }
}



class BOB extends Banker{
    public BOB(String name) {
        super("BOB");
    }

    @Override
    public String greet() {
        return super.greet();
    }
}

class BOI extends Banker{
    public BOI(String name) {
        super("BOI");
    }

    @Override
    public String greet() {
        return "welcome to BOI";
    }
}


public class Main {
    public static void main(String[] args){

        for (int i = 0; i<4 ; i++){
            Banker banker = GenerateObjects();
            System.out.println("Bank greet is : " + banker.greet());
        }
    }
    public static Banker GenerateObjects(){
        int random =  (int)(Math.random()*3 + 1) ;
        System.out.print( " " +  random + " ");
        switch (random){
            case 1 : return new SBI("SBI Bank");

            case 2 : return new BOB("BOB Bank");

            case 3 : return new BOI("BOI Bank");

            default: return null;
                     // no break because bcoz return is used
        }
    }
}
