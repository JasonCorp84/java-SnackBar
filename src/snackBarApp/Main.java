package snackBarApp;

public class Main
{
    private static void workWithData()
    {
       Customer c1 = new Customer("Jane", 45.25);
       Customer c2 = new Customer("Bob", 33.14);
       System.out.println("customer 1 " + c1);
       System.out.println("Customer 2 " + c2);

       VendingMachine v1 = new VendingMachine("Food");
       VendingMachine v2 = new VendingMachine("Drink");
       VendingMachine v3 = new VendingMachine("Office");
       System.out.println(v1);
       System.out.println(v2);
       System.out.println(v3);


       Snack s1 = new Snack("Chips", 36, 1.75, "Food");
       Snack s2 = new Snack("Chocolate Bar",36, 1.00, "Food");
       Snack s3 = new Snack("Chips", 30, 1.75, "Food");
       System.out.println(s1);
       System.out.println(s2);
       System.out.println(s3);

       Snack s4 = new Snack("Soda", 24, 2.50, "Drink");
       Snack s5 = new Snack("Water", 20, 2.75, "Drink");
       System.out.println(s4);
       System.out.println(s5);
    }
    public static void main(String[] args)
    {
        workWithData();
    }
}
