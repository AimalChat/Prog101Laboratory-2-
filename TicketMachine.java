/**
 * TicketMachine models a naive ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * It is a naive machine in the sense that it trusts its users
 * to insert enough money before trying to print a ticket.
 * It also assumes that users enter sensible amounts.
 *
 * @author David J. Barnes and Michael Kölling
 * @version 7.0
 */
public class TicketMachine
{
    // The price of a ticket from this machine.
    private int price ;
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;
    //The state of the student
    private boolean alive;

    /**
     * Create a machine that issues tickets of the given price.
     * Note that the price must be greater than zero, and there
     * are no checks to ensure this.
     */
    public TicketMachine(int cost)
    {
        price = cost;
        balance = 0;
        total = 0;
    }

    /**
     * Set the alive state of the student
     */
    public void alive(boolean alive)
    {
        alive = true;
    }

    /**
     * Show the price of tickets for this machine.
     */
    public void showPrice()
    {
        int xyz= price;
        System.out.println("The price of a ticket is " + xyz + " cents.");
    }
    
    /**
     * Retreive the total amount of money collected by this machine.
     */
    public int getTotal()
    {
        return total;
    }
    
    /**
     * Prompt the message to the caller : Please insert the correct 
     * amount of money.
     */
    public void prompt()
    {
        System.out.println("Please insert the correct amount of money.");
    }
    
    /**
     * Return the price of a ticket.
     */
    public int getPrice()
    {
        return price;
    }

    /**
     * Return the amount of money already inserted for the
     * next ticket.
     */
    public int getBalance()
    {
        return balance;
    }

    /**
     * Reset value of the balance via a new input.
     */
    public void setBalance(int newBalance)
    {
        balance = newBalance;
    }

    
    /**
     * Receive an amount of money from a customer.
     */
    public void insertMoney(int amount)
    {
        balance = balance + amount;
    }

    /**
     * Print a ticket.
     * Update the total collected and
     * reduce the balance to zero.
     */
    public void printTicket()
    {
        // Simulate the printing of a ticket.
        System.out.println("##################");
        System.out.println("# The BlueJ Line");
        System.out.println("# Ticket");
        System.out.println("# " + price + " cents.");
        System.out.println("##################");
        System.out.println("My cat has green eyes.");
        System.out.println();

        // Update the total collected with the balance.
        total = total + balance;
        // Clear the balance.
        balance = 0;
    }
}
