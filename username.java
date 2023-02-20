import java.util.Scanner;

public class username {
    public static void main(String[] args) {

        String username;

        System.out.println("Enter a username that contains 5 or more characters and contains $ in it");

        Scanner inputScanner = new java.util.Scanner(System.in);
            username = inputScanner.nextLine();
            inputScanner.close();

        if (username.isEmpty()) {
            System.out.println("Please enter a username longer than 5 characters");
        } else if (username.length() < 5) {
            System.out.println("Please enter a username with 5 or more characters");
        } else if (username.lastIndexOf("$") == -1) {
            System.out.println("Please enter the $ symbol into your username");
        } else {
            System.out.println("Username was accepted!");
        }

    }
}
