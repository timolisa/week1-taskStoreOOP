package org.retailstore;

import org.retailstore.staff.Cashier;
import org.retailstore.staff.Manager;

public class Main {
    public static void main(String[] args) {
        Store store = new Store("ShopWell", 1200000);
        System.out.printf("%s has been created with capital of 1,200,000 naira", store.getStoreName());


        System.out.println("\n********************************\n");
        Manager manager = new Manager("James Brown", store);
        System.out.printf("%s is the manager and owner of %s.", manager.getName(), store.getStoreName());


        System.out.println("\n********************************\n");
        Cashier cashier1 = new Cashier("abc", "1eAZ", store);
        Cashier cashier2 = new Cashier("def", "yta1", store);
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


    }
}