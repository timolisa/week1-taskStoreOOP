package org.retailstore;

import org.retailstore.staff.Cashier;
import org.retailstore.staff.Manager;

public class Main {
    public static void main(String[] args) {
        Store store = new Store("ShopWell", 1200000);
        System.out.printf("%s has been created with capital of 1,200,000 naira", store.getStoreName());


        System.out.println("\n********************************\n");
        Manager manager = new Manager("James Brown", store);
        System.out.printf("Mr. %s is the manager and owner of %s.", manager.getName(), store.getStoreName());

        System.out.println("\n********************************\n");
        Product product1 = new Product("Bread", 120, 30);
        Product product2 = new Product("Rice", 1000, 20);
        manager.addProductToStore(product1);
        System.out.printf("Mr. %s added %d units of %s to the goods stock.", manager.getName(), product1.getQuantity(), product1.getName());
        System.out.println();
        manager.addProductToStore(product2);
        System.out.printf("Mr. %s added %d units of %s to the goods stock.", manager.getName(), product2.getQuantity(), product2.getName());


        System.out.println("\n********************************\n");
        Cashier cashier1 = new Cashier("Steph Happiness", "1eAZ", store);
        Cashier cashier2 = new Cashier("Naomi Osaka", "yta1", store);
        System.out.printf("%s is the cashier1 at %s.", cashier1.getName(), store.getStoreName());


        System.out.println("\n********************************\n");
        manager.hireCashier(cashier1);
        System.out.printf("%s has been hired!", cashier1.getName());


        System.out.println("\n********************************\n");
        manager.hireCashier(cashier2);
        System.out.printf("%s has been hired!", cashier2.getName());

        System.out.println("\n********************************\n");
        manager.fireCashier(cashier1);
        System.out.printf("%s has been fired!", cashier1.getName());


        System.out.println("\n********************************\n");
        Customer customer = new Customer("Harry", 200000);
        System.out.println("New customer entered the store.");
        customer.addToCart(product1, 1);
        System.out.printf("Mr. %s added %s to their cart.", customer.getName(), product1.getName());
        System.out.println();
        customer.addToCart(product2, 2);
        System.out.printf("Mr. %s added %s to their cart.", customer.getName(), product2.getName());

        System.out.println("\n********************************\n");
        cashier2.checkOut(customer);
        System.out.printf("%s has paid from their credit card.", customer.getName());
        System.out.println();
        System.out.printf("%s has issued receipt to %s", cashier2.getName(), customer.getName());


    }
}