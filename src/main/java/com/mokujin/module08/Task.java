package com.mokujin.module08;

public class Task {

    private String taskName;
    private String taskCategory;
    private boolean isCompleted;

    public Task(String taskName, String taskCategory) {
        this.taskName = taskName;
        this.taskCategory = taskCategory;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {

        isCompleted = completed;
    }

    public String getTaskName() {
        return taskName;
    }

    public String getTaskCategory() {
        return taskCategory;
    }
}
