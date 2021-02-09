public class BankDriver{
  public static void main(String[] args) {
    Bank account1 = new Bank("Eric", "000000");

    account1.deposit(100);

    System.out.println(account1.displayTransaction());
    System.out.println(account1.displayDeposit());

    System.out.println(account1.displayBalance());

    account1.withdraw(50);
    System.out.println(account1.displayTransaction());
    System.out.println(account1.displayWithdrawal());

    System.out.println(account1.displayBalance());

    account1.withdraw(100);
    account1.deposit(10);
    account1.deposit(200);
    account1.deposit(50);
    account1.deposit(75);
    
    System.out.println(account1.displayTransaction());
    System.out.println(account1.displayDeposit());
    System.out.println(account1.displayBalance());
    System.out.println(account1.displaySummary());
  } //end main
} //end class
