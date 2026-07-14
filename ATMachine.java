import java.util.*;

class ATM {
     float Balance;
     int PIN = 5674;

     // public void checkpin() {
     //      System.out.println("Enter your pin: ");
     //      Scanner sc = new Scanner(System.in);
     //      int enteredpin = sc.nextInt();
     //      if (enteredpin == PIN) {
     //           menu();
     //      } else {
     //           System.out.println("Invalid pin, try again");
     //      }
     // }

     ATM(int pin){
          // this.pin = 1223;
          if(pin == PIN){
               menu();
          }
          else{
               System.out.println("Invalid pin, try again");
          }
     }

     public void menu() {
          System.out.println("1. Check A/C balance");
          System.out.println("2. Withdraw Money");
          System.out.println("3. Dpeosit Money");
          System.out.println("4. EXIT");

          Scanner sc = new Scanner(System.in);
          int opt = sc.nextInt();

          if (opt == 1) {
               checkBalance();
          } else if (opt == 2) {
               withdrawMoney();
          } else if (opt == 3) {
               depositMoney();
          } else if (opt == 4) {
               return;

          } else {
               System.out.println("Enter a valid choice");
          }
     }

     public void checkBalance() {
          System.out.println("Balance: " + Balance);
          menu();
     }

     public void withdrawMoney() {
          System.out.println("Enter amount to withdraw");
          Scanner sc = new Scanner(System.in);
          float Amount = sc.nextFloat();
          if (Amount > Balance) {
               System.out.println("Insufficient Balance");
          } else {
               Balance = Balance - Amount;
               System.out.println("Money withdrawl successful");
          }
          menu();
     }

     public void depositMoney() {
          System.out.println(" Enter amount to enter: ");
          Scanner sc = new Scanner(System.in);
          float Amount = sc.nextFloat();
          Balance += Amount;
          System.out.println("Money deposited successfully");
          menu();
     }
}

public class ATMachine {
     public static void main(String[] args) {
          System.out.println("enter a pin");
          Scanner sc = new Scanner(System.in);
          int pin = sc.nextInt();
          ATM obj = new ATM(pin);
          
     }
}