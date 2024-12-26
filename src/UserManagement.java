import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class UserManagement {
    ArrayList<User>users=new ArrayList<>();
    ArrayList<Role>roles=new ArrayList<>();
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
                System.out.println("you Entered a valide email");
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
            if (user.getName().contains(toSearch) || user.getEmail().contains(toSearch) || user.getRole().getRoleName().contains(toSearch)){
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
}
