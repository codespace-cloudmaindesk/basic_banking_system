public class banking_system {
    public static void main(String[]args) {
    double balance = 1000.0;
    String log = "Intial balance: R" + balance + "\n" ;

    //simulate a deposit 
    double depositAmount = 500.0;
    balance += depositAmount;
    log += "Deposited: R" + depositAmount + "\n";

    //simulate a withdrawal
    double withdrawalAmount = 200.0;
    if (withdrawalAmount <= balance){
        balance -= withdrawalAmount;
        log += "Withdrew: R" + withdrawalAmount + "\n";
    } else{
        log += "Failed to withraw: R" + withdrawalAmount + " (Insufficient balance)\n";
    }


    // Display final balance and transaction log
    String output = "Transaction History:\n" + log + "Final Balance: R" + balance;
    System.out.println(output);

    }
}
