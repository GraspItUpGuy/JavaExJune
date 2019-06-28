import java.util.Scanner;

public class Main {
    // object from a class in the same package
    private static  ToDoFunction myToDoList = new ToDoFunction();
    // Scanner
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args){

        int command = 0;

        printCommand();
        int exit = 1;

        while(exit !=0){
            System.out.println("Enter your command/choices");
            command = input.nextInt();
            input.nextLine();

            switch (command){
                case 0 : printCommand();
                          break;
                case 1 :
                         System.out.println("Displaying the list");
                         myToDoList.displayAllToDo();
                          break;
                case 2 :
                        System.out.println("Enter ToDo to add ");
                        String addThis = input.nextLine();
                        myToDoList.addToDo(addThis);
                        break;
                case 3 :
                        System.out.println("Enter the index to be updated");
                        int indexToUpdate = input.nextInt();
                        System.out.println("Enter updated ToDo");
                        String UpdateThis = input.nextLine();
                        myToDoList.UpdateToDo(indexToUpdate ,UpdateThis );
                        break;
                case 4 :
                         System.out.println("Which toDO to delete");
                         int indexTODelete = input.nextInt();
                         myToDoList.removeToDo(indexTODelete);
                         break;
                case 5 :
                        System.out.println("Enter the todo to be searched");
                        String searchThis = input.nextLine();
                        myToDoList.SearchToDo(searchThis);
                        break;
                case 6 : exit = 0;
                        break;
                default :
                    System.out.println("invalid input");
            }
        }

    }
    public static void printCommand(){
        System.out.println("We offer follwing awesome features");
        System.out.println("\n1. print the list" + "\n" + "2. add to the list");
        System.out.println("\n3. Update the list" + "\n" + "4. Remove from  the list");
        System.out.println("\n5. Search the list" + "\n" + "6. Exit");


    }
}
