package com.company;
import java.util.Scanner;

public class Main {
    private static ToDoFunction myToDoList = new ToDoFunction();
    // importing code from other file
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here

        int command = 0;
        printCommand();
        boolean exit = false;
        while(!exit){
            System.out.println("Enter your command / choices : ");
            command = input.nextInt();
            input.nextLine();

            switch(command){
                case 0 : printCommand();
                         break;
                case 1 : myToDoList.PrintTODoList();
                         break;
                case 2 :  addItem();
                         break;
                case 3 : updateItem();
                          break;
                case 4 : removeItem();
                         break;
                case 5 : searchItem();
                         break;
                case 6 : exit =  true;
                         break;
                 default:
                     System.out.println("choice / command not available");

            }
        }



    }
    public static void printCommand(){
        System.out.println("commands : ");
        System.out.println("0. print available commands");
        System.out.println("1. print your to-do-list");
        System.out.println("2. add to the to-do-list");
        System.out.println("3. update the to-do-list");
        System.out.println("4. remove item from to-do-list");
        System.out.println("5. search item in to-do-list");
        System.out.println("6. exit the app");

    }

    public static void addItem(){
        System.out.println("enter your to-do");
        String newToDo = input.nextLine();
        myToDoList.addItem(newToDo);
    }
    public static void updateItem(){
        System.out.println("add the index to be updated");
        int index = input.nextInt();
        System.out.println("enter value to  be updated");
        String updateWithThis = input.nextLine();
        myToDoList.updateToDo(index -1, updateWithThis);
    }
    public static void removeItem(){
        System.out.println("enter index to be deleted");
        int index = input.nextInt() - 1 ;
        myToDoList.removeItem(index);
    }
    public static void searchItem(){
        System.out.println("Enter item to be searched");
        String searchThis = input.nextLine();

        if(myToDoList.findItem(searchThis) == null){
            System.out.println( "item not found");
        }else{
            System.out.println("found in list at ");
        }
    }
}
