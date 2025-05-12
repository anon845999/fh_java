package at.technikum.todoapp.entitiy;

import java.time.LocalDateTime;
import java.util.UUID;

public class Todo {
    private String id;
    private String task;
    private LocalDateTime dueDate;
    private boolean done;
    private String description;
    private String category;
    private String priority;
    private String status;
    private String createdBy;
    private String createdOn;
    private String modifiedBy;
    private String modifiedOn;
    private String deletedBy;
    private String deletedOn;
    private String version;

    public Todo(String task, LocalDateTime dueDate, boolean done) {
        this.id = UUID.randomUUID().toString();
        this.task = task;
        this.dueDate = dueDate;
        this.done = done;
    }

    public String getId() {
        return id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public LocalDateTime getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
