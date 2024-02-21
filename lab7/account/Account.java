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
        if (age < 18) {
            throw new AgeException("Age must be at least 18 years old.");
        }
        if (age <= 0) {
            throw new AgeException("Age must be a positive integer number.");
        }
        this.age = age;
    }

    private void setUsername(String username) throws UsernameException {
        if (username.length() < 6) {
            throw new UsernameException("Username must be more than 5 characters long.");
        }
        if (username.length() > 50) {
            throw new UsernameException("Username must be less than 50 characters long.");
        }
        this.username = username;
    }

    private void setPassword(String password) throws PasswordException {
        if (password.length() < 8 || password.length() > 32) {
            throw new PasswordException("Password must be between eight and 32 characters long.");
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

        while (!isAccountCreated) {
            try {
                System.out.print("Please enter username: ");
                String username = scanner.nextLine();

                System.out.print("Please enter password: ");
                String password = scanner.nextLine();

                System.out.print("Please enter age: ");
                int age = Integer.parseInt(scanner.nextLine());

                account1 = new Account(age, username, password);
                System.out.println("Account created successfully with Username: " + username + ", Password: " + password + ", and Age: " + age);
                isAccountCreated = true;
            } catch (UsernameException e) {
                System.out.println("Error creating account: " + e.getMessage());
            } catch (PasswordException e) {
                System.out.println("Error creating account: " + e.getMessage());
            } catch (AgeException e) {
                System.out.println("Error creating account: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Error creating account: Age must be a valid integer.");
                System.out.println("Please enter a valid age.");
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
