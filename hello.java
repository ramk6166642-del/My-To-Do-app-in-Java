import java.util.ArrayList;
import java.util.Scanner;
class A 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();
        ArrayList<Boolean> completed = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n....MY TO-DO APP....");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Mark Task as Completed");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter your task: ");
                    String task = sc.nextLine();
                    tasks.add(task);
                    completed.add(false);
                    System.out.println("Task added successfully!");
                    break;

                case 2:
                    if (tasks.isEmpty())
                    {
                        System.out.println("No tasks available.");
                    }
                    else
                    {
                        System.out.println("\n===== YOUR TASKS =====");

                        for (int i = 0; i < tasks.size(); i++) 
                        {
                            String status = completed.get(i)? "Completed": "Pending";
                            System.out.println((i + 1) + ". " + tasks.get(i)+ " [" + status + "]");
                        }
                    }
                    break;

                case 3:
                    if (tasks.isEmpty())
                    {
                        System.out.println("No tasks to complete.");
                    } 
                    else 
                    {
                        System.out.print("Enter task number completed: ");
                        int taskNo = sc.nextInt();

                        if (taskNo >= 1 && taskNo <= tasks.size()) 
                        {
                            completed.set(taskNo - 1, true);
                            System.out.println("Task marked as completed!");
                        } 
                        else 
                        {
                            System.out.println("Invalid task number!");
                        }
                    }
                    break;

                case 4:
                    if (tasks.isEmpty()) 
                    {
                        System.out.println("No tasks to delete.");
                    } 
                    else 
                    {
                        System.out.print("Enter task number to delete: ");
                        int taskNo = sc.nextInt();

                        if (taskNo >= 1 && taskNo <= tasks.size())
                        {
                            tasks.remove(taskNo - 1);
                            completed.remove(taskNo - 1);
                            System.out.println("Task deleted successfully!");
                        } 
                        else 
                        {
                            System.out.println("Invalid task number...!");
                        }
                    }
                    break;

                case 5:
                    System.out.println("Thank you for using MY To-Do App!");
                    break;

                default:
                    System.out.println("Invalid choice! Please Try again...");
            }
        } while (choice != 5);
    }
}
