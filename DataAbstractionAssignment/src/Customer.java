import javax.security.sasl.SaslClient;
import java.util.ArrayList;
import java.util.Date;

public class Customer
{
    private String name;
    private int accountNumber;
    private ArrayList<Deposit> deposits = new ArrayList<Deposit>();
    private ArrayList<Withdraw> withdraws = new ArrayList<Withdraw>();
    private double checkBalance;
    private double savingBalance;
    public static final String CHECKING = "Checking";
    public static final String SAVING = "Saving";
    private final int OVERDRAFT = -100;

    Customer()
    {
        //requires: void
        //modifies: this
        //effect: default constructor for class customer

        name = "undefined";
        accountNumber = 0;
        checkBalance = 0.0;
        savingBalance = 0.0;
    }

    Customer(String name, int accountNumber, double checkBalance, double savingBalance)
    {
        //requires: String name, int accountNumber, double checkDeposit, double savingDeposit
        //modifies: this
        //effects: sets the instance of the customer class's name, accountNumber, checkDeposit, and
        //savingDeposit values

        this.name = name;
        this.accountNumber = accountNumber;
        this.checkBalance = checkBalance;
        this.savingBalance = savingBalance;
    }

    public double deposit(double amt, Date date, String account)
    {
        //requires: double amt, Date date, String account, account must be either "Checking" or "Saving"
        //modifies: ArrayList deposits of class Deposit, double checkBalance or double savingBalance
        //effects: creates a new instance of class Deposit deposit, and puts it in the ArrayList deposits
        //of class Deposit. If account is equal to the String CHECKING, double amt is added to the double
        //checkBalance. If account is equal to the String SAVING then double amt is added to the double
        //savingbalance.

        Deposit deposit = new Deposit(amt, date, account);

        if (account == CHECKING)
        {
            this.checkBalance = this.checkBalance + amt;
        }

        if (account == SAVING)
        {
            this.savingBalance = this.savingBalance + amt;
        }

        deposits.add(deposit);

        return 0;
    }

    public double withdraw(double amt, Date date, String account)
    {
        //requires: double amt, Date date, String account, account must be either "Checking" or "Saving"
        //modifies: ArrayList withdraws of class Withdraw, double checkBalance or double savingBalance
        //effects: creates a new instance of class Withdraw withdraw, and puts it in the ArrayList withdraws
        //of class Withdraw. If account is equal to the String CHECKING, double amt is added to the double
        //checkBalance. If account is equal to the String SAVING then double amt is added to the double
        //savingbalance. Also, this method calls the method checkOverdraft, and if it returns true, it will
        //print a readable and understandable line that the withdrawal will be an overdraft.

        Withdraw withdraw = new Withdraw(amt, date, account);

        if (account == CHECKING)
        {
            this.checkBalance = this.checkBalance - amt;
        }

        if (account == SAVING)
        {
            this.savingBalance = this.savingBalance - amt;
        }

        withdraws.add(withdraw);

        if (checkOverdraft(amt, account) == true)
        {
            System.out.println("NOTE: the withdrawal of $" + String.valueOf(amt) + " Date: " + String.valueOf(date) + " from account: " + account + " is an overdraft.");
        }

        return 0;
    }

    private boolean checkOverdraft(double amt, String account)
    {
        //requires: double amt, string account
        //modifies: void
        //effect: if String account is equal to "Checking" and double checkBalance minus amt is less than OVERDRAFT (-100)
        //than this method returns true. if String account is equal to "Saving" and double savingBalance minus amt is less than OVERDRAFT (-100)
        //than this method returns true. Otherwise, the method will return false.

        if (account == CHECKING && checkBalance - amt < OVERDRAFT)
        {
            return true;
        }

        if (account == SAVING && savingBalance - amt < OVERDRAFT)
        {
            return true;
        }

        return false;
    }

    //do not modify
    public void displayDeposits()
    {
        //requires: void
        //modifies: void
        //effect: iterates through each Deposit d in the Arraylist of class Deposit deposits, and for each d calls the
        //method ToString() in class Deposit which returns the deposit as a readable and understandable String including
        //amount deposited, date deposited, and what kind of account the deposit was made to.

        for(Deposit d : deposits)
        {
            System.out.println(d.toString());
        }
    }

    //do not modify
    public void displayWithdraws()
    {
        //requires: void
        //modifies: void
        //effect: iterates through each Withdraw q in the Arraylist of class Withdraw withdraws, and for each w calls the
        //method ToString() in class Withdraw which returns the withdraw as a readable and understandable String including
        //amount withdrew, date withdrew, and what kind of account the withdrawal was made from.

        for(Withdraw w : withdraws)
        {
            System.out.println(w.toString());
        }
    }
}
