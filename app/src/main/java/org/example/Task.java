package org.example;
public class Task {
    private String description;
    private boolean completed;
    public Task(String description) {//constructor
        this.description = description;
        this.completed = false;
    }
    public void MarkAsCompleted() {
        this.completed = true;
    }
    public void MarkAsUncompleted() {
        this.completed = false;
    }
    public String getDescription() {
        return description;
    }
    public boolean GetCompletionStatus() {
        return completed;
    }
}
