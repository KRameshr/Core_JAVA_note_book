package Demo.TodoListProject;

import java.util.ArrayList;
import java.util.Scanner;

class TodoApp {
    static void addTask() {
        System.out.print("Enter task title: ");
        String title = sc.nextLine();
        tasks.add(new Task(title));
        System.out.println("Task added successfully!");
    }

    static void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks found!");
            return;
        }

        System.out.println("\nYour Tasks:");
        for (int i = 0; i < tasks.size(); i++) {
            tasks.get(i).display(i + 1);
        }
    }

    static void markTaskDone() {
        viewTasks();
        if (tasks.isEmpty()) return;

        System.out.print("Enter task number to mark as done: ");
        int num = sc.nextInt();

        if (num >= 1 && num <= tasks.size()) {
            tasks.get(num - 1).isCompleted = true;
            System.out.println("Task marked as completed!");
        } else {
            System.out.println("Invalid task number!");
        }
    }

    static void deleteTask() {
        viewTasks();
        if (tasks.isEmpty()) return;

        System.out.print("Enter task number to delete: ");
        int num = sc.nextInt();

        if (num >= 1 && num <= tasks.size()) {
            tasks.remove(num - 1);
            System.out.println("Task deleted!");
        } else {
            System.out.println("Invalid task number!");
        }
    }
    static ArrayList<Task> tasks = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n--- TO-DO LIST MENU ---");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Mark Task as Done");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1: addTask(); break;
                case 2: viewTasks(); break;
                case 3: markTaskDone(); break;
                case 4: deleteTask(); break;
                case 5: System.out.println("Goodbye 👋"); break;
                default: System.out.println("Invalid choice!");
            }
        } while (choice != 5);
    }
}
