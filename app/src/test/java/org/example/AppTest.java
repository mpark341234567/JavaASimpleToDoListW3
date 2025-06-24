package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

class AppTest {
  // Put your tests here!
  @Test
  public void TaskCanBeAddedToToDoList(){
    ToDoList toDoList = new ToDoList();
    toDoList.addTask("Buy groceries");
    assertNotNull(toDoList);
  }
  @Test 
  public void GetCompletionStatusWorks() {
    Task task = new Task("Buy groceries");
    assertEquals(false, task.GetCompletionStatus());
  }
  @Test 
  public void MarkAsCompletedWorks() {
    Task task = new Task("Buy groceries");
    task.MarkAsCompleted();
    assertEquals(true, task.GetCompletionStatus());
  }
  @Test 
  public void MarkAsUncompletedWorks() {
    Task task = new Task("Buy groceries");
    task.MarkAsCompleted();
    task.MarkAsUncompleted();
    assertEquals(false, task.GetCompletionStatus());
  }
  @Test 
  public void TaskDescriptionIsCorrect() {
    Task task = new Task("Buy groceries");
    assertEquals("Buy groceries", task.getDescription());
  }
  @Test 
  public void CompleteTaskWorks() {
    ToDoList toDoList = new ToDoList();
    toDoList.addTask("Buy groceries");
    toDoList.CompleteTask("Buy groceries");
    assertEquals(true, toDoList.get(0).GetCompletionStatus());
  }
}
