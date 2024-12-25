public class User extends Person{
    String email,password;
    Role role;

    public User(String name, int age,String email,String password, Role role) {
        super(name, age);
        this.email=email;
        this.password=password;
        this.role=role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return
                "\nRole----->  " + role.getRoleName() +
                "\nName-----> " + getName() +
                "\nAge-------> " + getAge() +
                "\nEmail-----> " +getEmail() ;
    }
}
