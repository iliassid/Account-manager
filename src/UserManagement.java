import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class UserManagement {
    ArrayList<User>users=new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    String email;


    public void AddUser(){
        System.out.println("Enter the user name: ");
        String name = scanner.nextLine();
        System.out.println("Enter the user age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        while (true){
            System.out.println("Enter the user email: ");
            email = scanner.nextLine();
            Pattern pattern = Pattern.compile("@");
            Matcher matcher = pattern.matcher(email);
            boolean toFind = matcher.find();
            if (!toFind){
                System.out.println("you have to include @ in the email");
            }else{
                System.out.println("you Entered a valid email");
                break;
            }
        }
        System.out.println("Enter the password: ");
        String password = scanner.nextLine();
        System.out.println("Enter the user role: ");
        String roleName = scanner.nextLine();
        Role role = new Role(roleName);

        User user = new User(name, age,email,password, role);
        users.add(user);
        System.out.println("the user added successfully");
    }

    public void SearchUser(){
        ArrayList<User>stock = new ArrayList<>();
        System.out.println("Enter name, email or role to search for the user ");
        String toSearch = scanner.nextLine();
        for (User user: users){
            if (user.getName().contains(toSearch) || user.getEmail().contains(toSearch)
                    || user.getRole().getRoleName().contains(toSearch)){
                stock.add(user);
            }
        }
        if (stock.isEmpty()){
            System.out.println("no user is found with this value that you enter");
        }
        for (User user: stock){
            System.out.println("the user u are searching for: ");
            System.out.println(user);
        }

    }
    public void editUser(){
        System.out.println("Enter the email of the account to update:");
        String accountEmail = scanner.nextLine();
        System.out.println("1.edit name");
        System.out.println("2.edit age");
        System.out.println("3.edit email");
        System.out.println("4.edit role");
        System.out.println("5.edit password");
        int choice = scanner.nextInt();
        scanner.nextLine();
        for (User user: users){
            if (user.getEmail().equals(accountEmail)){
                switch (choice){
                    case 1:
                        System.out.println("Enter the new name: ");
                        user.setName(scanner.nextLine());
                        break;
                    case 2:
                        System.out.println("Enter the new age: ");
                        user.setAge(scanner.nextInt());
                        break;
                    case 3:
                        System.out.println("Enter the new email: ");
                        user.setEmail(scanner.nextLine());
                        break;
                    case 4:
                        System.out.println("Enter the new role: ");
                        String rolename = scanner.nextLine();
                        Role role = new Role(rolename);
                        user.setRole(role);
                        break;
                    case 5:
                        System.out.println("Enter the new password: ");
                        user.setPassword(scanner.nextLine());
                        break;
                }
                System.out.println("User updated successfully");
                return;
            }
            System.out.println("User not found");
        }



    }
    public void displayUsers(){
        if (users.isEmpty()){
            System.out.println("No user has been found");
        }
        for (User user: users){
            System.out.println(user);
        }
    }
    public void deleteUser(){
        System.out.println("Enter the email of the user to delete");
        email = scanner.nextLine();
        users.removeIf(user -> user.getEmail().equals(email));
        System.out.println("The user removed successfully");
    }
}
