import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserManagement usermanagement = new UserManagement();




        while (true) {
            System.out.println("Enter your choice:");
            System.out.println("1 add new user");
            System.out.println("2 search for a user");
            System.out.println("3 edit a user info");
            System.out.println("4 show users");
            System.out.println("5 delete a user");
            System.out.println("6 quit");
            int choice=scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    usermanagement.AddUser();
                    break;
                case 2:
                    usermanagement.SearchUser();
                    break;
                case 3:
                    usermanagement.editUser();
                    break;
                case 4:
                    usermanagement.displayUsers();
                    break;
                case 5:
                    usermanagement.deleteUser();
                    break;
                case 6:
                    System.out.println("goodbye!");
                    return;
                default:
                    System.out.println("Enter a valid choice");
            }


        }


    }
}