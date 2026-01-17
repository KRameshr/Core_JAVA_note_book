package Demo.TodoListProject;

public class Task {
    String title;
    boolean isCompleted;

    Task(String title) {
        this.title = title;
        this.isCompleted = false;
    }

    void display(int index) {
        String status = isCompleted ? "Done" : "Pending";
        System.out.println(index + ". " + title + " - " + status);
    }

}
