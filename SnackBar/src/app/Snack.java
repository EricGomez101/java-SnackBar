package app;

public class Snack {
    private static int maxID = 0;
    private final int id;
    private String name;
    private int quantity;
    private double cost;

    public Snack(String name, int quantity, double cost) 
    {
        maxID++;
        this.id = maxID;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void addQuantity(int quantity)
    {
        this.quantity += quantity;
        System.out.println("Snack " + name + " gets " + quantity + " more. new total: " + this.quantity);
    }

    public void removeQuantity(int amount)
    {
        this.quantity -= amount;
    }

    public double getTotal(int quantity)
    {
        return cost * quantity;
    }
}