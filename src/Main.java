import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserManagement usermanagement = new UserManagement();
        int choice=0;

        /*if (choice == 6) {
            System.out.println("goodbye!");
            return;
        }*/
        while (choice != 6) {
            System.out.println("Enter your choice:");
            System.out.println("1 add new user");
            System.out.println("2 search for a user");
            System.out.println("3 edit a user info");
            System.out.println("4 delete a user");
            System.out.println("5 show users");
            System.out.println("6 quit");
            choice = scanner.nextInt();
            scanner.nextLine();




            switch (choice) {
                case 1:
                    usermanagement.AddUser();
                    break;
                case 6:
                    System.out.println("goodbye!");
                    break;
                default:
                    System.out.println("Enter a valid choice");
            }


        }
    }
}