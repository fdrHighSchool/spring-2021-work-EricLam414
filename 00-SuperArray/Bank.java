public class Bank{
  private int balance;

  private SuperArray transaction;
  private SuperArray deposit;
  private SuperArray withdrawal;

  private String name;
  private String accountID;

  public Bank(String n, String acc){
    this.name = n;
    this.accountID = acc;

    this.transaction = new SuperArray();
    this.deposit = new SuperArray();
    this.withdrawal = new SuperArray();
  } //end constructor
  public void deposit(int m){
    this.balance += m;
    this.transaction.add(m);
    this.deposit.add(m);
  }
  public void withdraw(int m){
    if (this.balance - m < 0){
      System.out.println("You do not have enough money!");
    }
    else{
      int neg = m - 2*m;
      this.balance -= m;
      this.transaction.add(neg);
      this.withdrawal.add(neg);
    }
  }
  public String displayBalance(){
    return "$" + this.balance;
  }
  public String displayTransaction(){
    return this.transaction.toString();
  }
  public String displayDeposit(){
    return this.deposit.toString();
  }
  public String displayWithdrawal(){
    return this.withdrawal.toString();
  }

} //end class
