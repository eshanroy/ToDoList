import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Delete Task");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter task: ");
                String task = sc.nextLine();
                tasks.add(task);
                System.out.println("Task added!");
            } 
            else if (choice == 2) {
                System.out.println("\nYour Tasks:");
                if (tasks.isEmpty()) {
                    System.out.println("No tasks to do.");
                } else {
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println((i + 1) + ". " + tasks.get(i));
                    }
                }
            } 
            else if (choice == 3) {
                if (tasks.isEmpty()) {
                    System.out.println("No tasks to delete.");
                } else {
                    System.out.println("\nWhich task number to delete?");
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println((i + 1) + ". " + tasks.get(i));
                    }
                    System.out.print("Enter number: ");
                    int delIndex = sc.nextInt();
                    sc.nextLine(); 

                    if (delIndex >= 1 && delIndex <= tasks.size()) {
                        String removed = tasks.remove(delIndex - 1);
                        System.out.println("Deleted: " + removed);
                    } else {
                        System.out.println("Invalid number.");
                    }
                }
            } 
            else if (choice == 4) {
                System.out.println("Exiting...");
                break;
            } 
            else {
                System.out.println("Invalid choice. Try again.");
            }
        }

        sc.close();
    }
}
