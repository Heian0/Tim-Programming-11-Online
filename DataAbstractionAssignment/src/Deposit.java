import java.util.Date;

public class Deposit
{
    private double amount;
    private Date date;
    private String account;

    Deposit(double amount, Date date, String account)
    {
        this.amount = amount;
        this.date = date;
        this.account = account;
    }

    public String toString()
    {
        return "Deposit of: $" + String.valueOf(this.amount) + " Date: " + String.valueOf(this.date) + " into account: " + account;
    }
}
