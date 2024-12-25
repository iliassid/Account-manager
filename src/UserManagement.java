import java.util.ArrayList;
import java.util.Scanner;

public class UserManagement {
    ArrayList<User>users=new ArrayList<>();
    ArrayList<Role>roles=new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    //User user = new User();


    public void AddUser(){
        System.out.println("Enter the user name: ");
        String name = scanner.nextLine();
        System.out.println("Enter the user age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the user email: ");
        String email = scanner.nextLine();
        System.out.println("Enter the password: ");
        String password = scanner.nextLine();
        System.out.println("Enter the user role: ");
        String roleName = scanner.nextLine();
        Role role = new Role(roleName);

        User user = new User(name, age,email,password, role);
        users.add(user);
        System.out.println("the user added successfully");
    }
}
