package app;

import java.util.ArrayList;
import java.util.List;


public class VendingMachine 
{
    private static int maxID = 0;
    private static int snackID = 0;
    private int id;
    private String name;
    private List<Snack> inventory = new ArrayList<>();

    public VendingMachine(String name)
    {
        maxID++;
        this.id = maxID;
        this.name = name;
    }
    public int getId() {
        return id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    public void addSnack(Snack snack) {
        inventory.add(snack);
    }
    
    public double buySnack(int index, int quantity) 
    {
        try
        {
            Snack snack = inventory.get(index);
            if (snack.getQuantity() > quantity)
            {
                snack.removeQuantity(quantity);

                return snack.getTotal(quantity);
            }
            else {
                // throws error if quantity is greater than the total stock of snacks.
                throw new Exception();
            }
        } 
        catch (Exception e)
        {
            return 0;
        }
    }
    public Snack getSnack(int index)
    {
        return inventory.get(index);
    }

}