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

    this.transaction = new SuperArray(1);
    this.deposit = new SuperArray(1);
    this.withdrawal = new SuperArray(1);
  } //end constructor

  public void deposit(int m){
    this.balance += m;
    this.transaction.add(m);
    this.deposit.add(m);
  }//end deposit

  public void withdraw(int m){
    //sees if you have enough money to withdraw
    if (this.balance - m < 0){
      System.out.println("You do not have enough money!");
    }
    else{
      int neg = m - 2*m;
      this.balance -= m;
      this.transaction.add(neg);
      this.withdrawal.add(neg);
    }
  }//end withdraw

  public String displayBalance(){
    return "$" + this.balance;
  }//end displayBalance

  public String displayTransaction(){
    return this.transaction.toString();
  }//end displayTransaction

  public String displayDeposit(){
    return this.deposit.toString();
  }//end displayDeposit

  public String displayWithdrawal(){
    return this.withdrawal.toString();
  }//displayWithdrawal
  public String displaySummary(){
    String str = "Your last 5 transactions are :";
    if(transaction.getLength() < 5){
      for(int i = 0; i < transaction.getLength(); i++){
        if(i == transaction.getLength() - 1){
          str += " " + transaction.getValue(i);
        }//end if
        else{
          str += " " + transaction.getValue(i) + " ,";
        }//end else
      }//end for
    }//end if
    else{
      for(int i = transaction.getLength() - 5; i < transaction.getLength() ; i++){
        if(i == transaction.getLength() - 1){
          str += " " + transaction.getValue(i);
        }//end if
        else{
          str += " " + transaction.getValue(i) + " ,";
        }//end else
      }//end for
    }//end else
    return str;

  }//end displaySummary

} //end class
