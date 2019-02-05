package app;

public class Main {
    public static void main(String[] args) throws Exception {
        // creating customers.
        Customer jane = new Customer("Jane", 45.25);
        Customer bob = new Customer("Bob", 33.14);

        // creating vending machines
        VendingMachine food = new VendingMachine("Food");
        VendingMachine drink = new VendingMachine("Drink");
        VendingMachine office = new VendingMachine("Office");

        // creating snacks
        Snack chips = new Snack("Chips", 36, 1.75);
        Snack chocolateBar = new Snack("Chocolate Bar", 36, 1.00);
        Snack pretzel = new Snack("Pretzel", 30, 2.00);
        Snack soda = new Snack("Soda", 24, 2.50);
        Snack water = new Snack("Water", 20, 2.75);

        // adding snacks to vending machine.
        food.addSnack(chips);
        food.addSnack(chocolateBar);
        food.addSnack(pretzel);
        drink.addSnack(soda);
        drink.addSnack(water);

        jane.pay(drink.buySnack(0, 3));

    }
}