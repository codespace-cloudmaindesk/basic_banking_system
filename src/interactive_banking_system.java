import java.util.Scanner;  

public class interactive_banking_system {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Enter your initial account balance: R");
        double balance = scanner.nextDouble();

        while (true) {
            System.out.println("\nChoose an option:" + "\n");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Exit\n");
            System.out.print("Enter your choice [ 1, 2, or 3]: ");
            int choice = scanner.nextInt();


            if (choice == 1) {
                System.out.print("Enter the amount to deposit: R");
                double depositAmount = scanner.nextDouble();
                
                balance += depositAmount;
                System.out.println("Deposited: R" + depositAmount);
            } else if (choice == 2){
                System.out.print("Enter the amount to withdraw: R");
                double withdrawalAmount = scanner.nextDouble();

                if (withdrawalAmount <= balance){
                    balance -= withdrawalAmount;
                    System.out.println("Withdrew: R" + withdrawalAmount);

                } else {
                    System.out.println("Insufficient balance. Cannot withdraw R" + withdrawalAmount);

                }
            } else if (choice == 3) {
                System.out.println("Exiting the program. Thank you!");
                break;

            } else {
                System.out.println("Invalid choice. Please try again.");

            }
            System.out.println("Current balance: R" + balance);
        }
        scanner.close();
    }

}

