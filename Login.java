public class Login {
    public static void main(String[] args) {
        String username = "Badri";
        String password = "12345";

        if (username.equals("Badri") && password.equals("12345")) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid credentials!");
        }
    }
}