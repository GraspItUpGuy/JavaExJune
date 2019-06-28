import java.util.ArrayList;

public class ToDoFunction {
  private  ArrayList<String> toDoList = new ArrayList<String>();

  // add list item

    public void addToDo(String toDo){
        toDoList.add(toDo);
    }

    // remove list item
    public void removeToDo(int index){
        //   String itemToDelete = toDoList.get(index);
        toDoList.remove(index);
    }

    //print the entire list
    public void displayAllToDo(){
        System.out.println("Your list has : " + toDoList.size() + "items");
        for (int i=0; i<toDoList.size() ; i++){
            System.out.println( "(" + i+1 + "). " + toDoList.get(i) );
        }
    }

    // update the list
    public void UpdateToDo(int index , String UpdatedToDo){
        toDoList.set(index , UpdatedToDo);
        System.out.println("List updated at " + index + 1);
    }

    // Search feature for user
    public void SearchToDo(String searchThis){
        int index = toDoList.indexOf(searchThis);
        if(index >=0){
            System.out.println("ToDo found at" + index+1);
        }else{
            System.out.println("Error 404, Not Found !!!!!!!!");
        }
    }



}
