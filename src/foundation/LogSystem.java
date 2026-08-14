package foundation;

import java.util.Scanner;

public class LogSystem {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Username: ");
        String username = scanner.next();

        System.out.println("Password");
        String password = scanner.next();

        if (username == "admin" && password == "1234"){
            System.out.println("Login successful");
        }else {
            System.out.println("Invalid credentials");
        }
    }
}
