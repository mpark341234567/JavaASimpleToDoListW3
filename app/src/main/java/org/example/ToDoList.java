package org.example;

import java.util.ArrayList;

public class ToDoList {
    private ArrayList<Task> tasks = new ArrayList<>();

    public void addTask(String description) {
        Task task = new Task(description);//make a new task
        if (description == null || description.trim().isEmpty()) {
            System.out.println("Task description cannot be null or empty.");
            return; // exit if description is invalid
        }
        else {
            tasks.add(task);//add to arraylist
        }
    }
        
    public void CompleteTask(String description) {
        for (Task task : tasks) {//loop through all tasks
            if (task.getDescription().equals(description)) {//find matching description
                task.MarkAsCompleted();// mark as completed
                return;
            }
        }
        System.out.println("Task not found: " + description);// if not found, print message
    }
    public void UnCompleteTask(String description) {
        for (Task task : tasks) {// loop through all tasks
            if (task.getDescription().equals(description)) {// find matching description
                task.MarkAsUncompleted();// mark as uncompleted 
                return;
            }
        }
        System.out.println("Task not found: " + description);// if not found, print message
    }
    public Task get(int index) {
        try {
            return tasks.get(index);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index out of bounds: " + index);
            return null; 
        }
    }
    public void printAll() {
        for (Task task : tasks) {// loop through all tasks
            System.out.println(task.getDescription());// print description
        }
    }
    public void printCompleted() {
        for (Task task : tasks) {// loop through all tasks
            if (task.GetCompletionStatus()) {// check if completed
                System.out.println(task.getDescription());// print description
            }
        }
    }
    public void printUncompleted() {
        for (Task task : tasks) {// loop through all tasks
            if (!task.GetCompletionStatus()) {// check if uncompleted
                System.out.println(task.getDescription());// print description
            }
        }
    }
    public void clear() {
        tasks.clear();// clear the arraylist
    }
}
