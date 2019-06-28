package com.company;

import java.util.ArrayList;

public class ToDoFunction {

    private ArrayList<String> toDoList = new ArrayList<>();

    // Add list item
    public void addItem(String item){

        toDoList.add(item);
    }

    // remove list item
    public void removeItem(int index){
        String myItem = toDoList.get(index); // no use of it, just to confirm that the item
                                             // already exists
        toDoList.remove(myItem);
    }

    // print the entire list
    public void  PrintTODoList(){
        System.out.println("Your to-do-list has :  " + toDoList.size() +
                " number  of elements");
        for(int i=0; i<=toDoList.size(); i++ ){
            System.out.println( i+1 + ":" + toDoList.get(i));
        }
    }

    //update the list
    public void updateToDo(int index, String list){
        toDoList.set(index, list);
        System.out.println("ToDoList updated at position : " + index + 1 );
    }

    // search in to-do-list
    public String findItem(String searchThis){
       int index = toDoList.indexOf(searchThis);
       if (index == -1){
           return null;
       }else {
           return toDoList.get(index);
       }
    }



}
