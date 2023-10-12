package lesson1;

public class Bank {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Kevin", 1015.78, 765292);
        BankAccount account2 = new BankAccount("Eric", 12056.87, 738392);

        /*
         * State account 1: 
         * accountHolder = "Kevin"
         * balance = 1015.78
         * accountNumber = 765292
        */

        /*
         * State account 2:
         * accountHolder = "Eric"
         * balance = 12056.87
         * accountNumber = 738392
        */

        account1.deposit(2500.50);
  
        /*
         * State account 1: 
         * accountHolder = "Kevin"
         * balance = 3516.28
         * accountNumber = 765292
        */

        account2.withdraw(9500);

        /*
         * State account 2:
         * accountHolder = "Eric"
         * balance = 2556.87
         * accountNumber = 738392
        */
    }
}
