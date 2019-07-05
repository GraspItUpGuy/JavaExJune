public class Main {
    public static void main(String[] args){
        MyClass John = new MyClass("John DOe",35,33243);
//        John.name = "JOhn Doe";
//        System.out.println(John.name);



    }
}

// example of  encapsulation
class MyClass{
    private   String name ;
    private int age ;
    private int accNo;

    //getters
    public int getAge(){
        return age;
    }

    //setters
    public void setAge(int myAge){
        this.age =  myAge;
    }

    // use  cmd + n to generate code

    public MyClass(String name, int age, int accNo) {
        this.name = name;
        this.age = age;
        this.accNo = accNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo)g {
        this.accNo = accNo;
    }
}
