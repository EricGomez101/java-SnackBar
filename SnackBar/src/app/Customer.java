package app;

public class Customer
{
    private static int maxID = 0;
    private int id;
    private String name;
    private double cash;

    public Customer(String name, double cash)
    {
        maxID++;
        this.id = maxID;
        this.name = name;
        this.cash = cash;
    }

    public void addCash(double cash)
    {
        this.cash += cash;
        System.out.println(name + " finds $" + cash + " new total: " + this.cash);
    }
    
    public void buy(VendingMachine machine, int index, int quantity) 
    {
        double total = machine.buySnack(index, quantity);
        if (total < cash) {
            cash -= total;
            Snack snack = machine.getSnack(index);
            System.out.println(name + " buys " + quantity + " of snack " + snack.getName() + ". cash left: $" + cash + " snack quantity: " + snack.getQuantity());
        }
    }

    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }

    public double getCash()
    {
        return cash;
    }
}