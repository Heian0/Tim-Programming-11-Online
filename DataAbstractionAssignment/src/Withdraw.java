import java.util.Date;

public class Withdraw
{
    private double amount;
    private Date date;
    private String account;

    Withdraw(double amount, Date date, String account)
    {
        this.amount = amount;
        this.date = date;
        this.account = account;
    }

    public String toString()
    {
        return "Withdrawal of: $" + String.valueOf(this.amount) + " Date: " + String.valueOf(this.date) + " from account: " + account;
    }
}
