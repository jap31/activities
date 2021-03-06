package try3.hello.src.chapter_9exercise2;

import java.text.NumberFormat;

public class Account {
 private double balance;
 private Customer cust;
 
 /**
 * constructor
 * pre: none
 * post: An account created. Balance and 
 * customer data initialized with parameters.
 */
 public Account(double bal, String fName, String lName, String str, String city, String st, String zip) {
 balance = bal;
 
 cust = new Customer(fName, lName, str, city, st, zip);
 }
 /** 
 * Returns the current balance.
 * pre: none
 * post: The account balance has been returned.
 */
 public double getBalance() {
 return(balance);
 }

 public double getname() {
    return(balance);
    }
 /** 
 * A deposit is made to the account.
 * pre: none
 * post: The balance has been increased by the amount of the deposit.
 */
 public void deposit(double amt) {
 balance += amt;
 }
 /** 
 * A withdrawal is made from the account if there is enough money.
 * pre: none
 * post: The balance has been decreased by the amount withdrawn.
 */
 public void withdrawal(double amt) {
 if (amt <= balance) {
 balance -= amt;
 } else {
 System.out.println("Not enough money in account.");
 }
 }

 /** 
 * Returns a String that represents the Account object.
 * pre: none
 * post: A string representing the Account object has 
 * been returned.
 */
public String toString() {
    String accountString;
    NumberFormat money = NumberFormat.getCurrencyInstance();
    accountString = cust.toString();
    accountString += "Current balance is " + money.format(balance);
    return(accountString);
    }

public void charge_paccount(float charge){
    balance-=charge;
    System.out.println("Your balance is below 100, you have been deducted $2.");
}

public void charge_pbusiness(float charge){
    balance-=charge;
    System.out.println("Your balance is below 500, you have been deducted $10.");
}

   }