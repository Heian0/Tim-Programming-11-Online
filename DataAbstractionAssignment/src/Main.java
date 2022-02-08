import java.util.Date;

public class Main
{
    public static void main(String args[])
    {
        Customer clay = new Customer("Clay", 123456, 5000.00, 10000.00);

        clay.deposit(2000.00, new Date(122, 01, 02), "Saving");
        clay.deposit(500.00, new Date(122, 01, 03), "Checking");
        clay.withdraw(300.00, new Date(122, 01, 06), "Saving");
        clay.withdraw(250.00, new Date(122, 01, 07), "Checking");
        clay.withdraw(5300.00, new Date(122, 01, 07), "Checking");

        clay.displayDeposits();
        clay.displayWithdraws();
    }
}
