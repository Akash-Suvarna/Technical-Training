import java.util.Scanner;

public class ATMProgram {
    static int pin = 1234;
    static double balance = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to the ATM Program");
            System.out.print("Enter your PIN: ");
            int enteredPin = sc.nextInt();

            if (enteredPin == pin) {
                displayMenu();

                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter the amount to deposit: ");
                        double depositAmount = sc.nextDouble();
                        balance = deposit(depositAmount);
                        System.out.println("Transaction(1) : input: " + depositAmount + " output: " + balance);
                        break;
                    case 2:
                        System.out.print("Enter the amount to withdraw: ");
                        double withdrawAmount = sc.nextDouble();
                        balance = withdraw(withdrawAmount);
                        System.out.println("Transaction(2) : input: " + withdrawAmount + " output: " + balance);
                        break;
                    case 3:
                        System.out.println("Balance Enquiry: " + balance);
                        break;
                    case 4:
                        System.out.print("Enter the new PIN: ");
                        int newPin = sc.nextInt();
                        changePin(newPin);
                        System.out.println("PIN Change");
                        break;
                    case 5:
                        System.out.println("Exiting the program. Thank you!");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a valid option.");
                }
            } else {
                System.out.println("Invalid PIN. Please try again.");
            }
        }
    }

    static void displayMenu() {
        System.out.println("Options:");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Balance Enquiry");
        System.out.println("4. PIN Change");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    static double deposit(double amount) {
        balance += amount;
        return balance;
    }

    static double withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds. Unable to withdraw.");
        }
        return balance;
    }

    static void changePin(int newPin) {
        pin = newPin;
    }
}

