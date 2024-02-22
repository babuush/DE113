package account;

import java.util.Scanner;

public class Account {
    private int age;
    private String username;
    private String password;

    public Account(int age, String username, String password) throws AgeException, UsernameException, PasswordException {
        setAge(age);
        setUsername(username);
        setPassword(password);
    }

    private void setAge(int age) throws AgeException {
        if (age <= 0) {
            throw new AgeException("Age must be a positive integer number.");
        }
        if (age < 18) {
            throw new AgeException("Age must be at least 18 years old.");
        }
        this.age = age;
    }

    private void setUsername(String username) throws UsernameException {
        if (username.length() < 6) {
            throw new UsernameException("Username must be at least 6 characters long.");
        }
        if (username.length() > 50) {
            throw new UsernameException("Username must be less than 50 characters long.");
        }
        this.username = username;
    }

    private void setPassword(String password) throws PasswordException {
        if (password.length() < 8 || password.length() > 32) {
            throw new PasswordException("Password must be between 8 and 32 characters long.");
        }
        if (password.equals(username)) {
            throw new PasswordException("Password must be different from username.");
        }
        this.password = password;
    }

    public static Account accountCreate() {
        Account account1 = null;
        boolean isAccountCreated = false;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter username: ");
        String username = scanner.nextLine();

        System.out.print("Please enter password: ");
        String password = scanner.nextLine();

        System.out.print("Please enter age: ");
        int age = Integer.parseInt(scanner.nextLine());

        while (!isAccountCreated) {
            try {
                account1 = new Account(age, username, password);
                System.out.println("Account created successfully with Username: " + username + ", Password: " + password + ", and Age: " + age);
                isAccountCreated = true;
            } catch (UsernameException e) {
                System.out.println("Error creating account: " + e.getMessage());
                System.out.print("Please enter new username: ");
                username = scanner.nextLine();
            } catch (PasswordException e) {
                System.out.println("Error creating account: " + e.getMessage());
                System.out.print("Please enter new password: ");
                password = scanner.nextLine();
            } catch (AgeException e) {
                System.out.println("Error creating account: " + e.getMessage());
                System.out.print("Please enter new age: ");
                age = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Error creating account: Age must be a valid integer.");
            }
        }
        return account1;
    }

    @Override
    public String toString() {
        return "This account is created with Username: " + username + ", Password: " + password + ", and Age: " + age;
    }

    public static void main(String[] args) {
        Account acct = accountCreate();
        System.out.println(acct);
    }
}
