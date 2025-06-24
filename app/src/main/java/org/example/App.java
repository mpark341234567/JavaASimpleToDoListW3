package org.example;

public class App {
  public static void main(String[] args) {
    ToDoList list = new ToDoList();
    
    list.addTask(null);
    list.addTask("  ");
    list.addTask("Buy milk");
    list.addTask("Buy eggs");
    list.addTask("Prepare a lesson for CSC 122");
    list.addTask("Sow beet seeds");
 
    list.CompleteTask("Buy eggs");
 
    // Pretty prints a list of each of the four tasks above
    list.printAll();
 
    // Pretty prints the task "Buy eggs"
    list.printCompleted();
 
    // Pretty prints the tasks "Buy milk",
    // "Prepare a lesson for CSC 122", and "Sow beet seeds"
    list.printUncompleted();

    list.UnCompleteTask("Buy eggs");

    list.printUncompleted();
 
    // Clears the to-do list
    list.clear();
 
    // Pretty prints a message saying that the list is empty
    list.printAll();
  }
}
