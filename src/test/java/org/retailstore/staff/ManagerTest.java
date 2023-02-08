package org.retailstore.staff;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.retailstore.Customer;
import org.retailstore.Product;
import org.retailstore.Store;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {
    @Test
    void shouldCreateAManager() {
        Store store = new Store("Shoprite", 120000);
        Manager manager = new Manager("Jary", store);
        Assert.assertTrue(!manager.getName().equals(null));
        Assert.assertTrue(manager.getName().equals("Jary"));
    }
    @Test
    void shouldSetProductPrice() {
        Store store = new Store("Shoprite", 1200000);
        Product product = new Product("Bread", 100.0, 30);
        Manager manager = new Manager("John Doe", store);
        manager.addProductToStore(product);
        manager.updatePriceOfProduct(product, 120.0);
        Assert.assertTrue(product.getPrice() == 120);
    }

    @Test
    void hireCashier() {
        Store store = new Store("Shopwell", 120000);
        Manager manager = new Manager("Abc", store);
        Cashier cashier = new Cashier("gda", "2wwe", store);
        manager.hireCashier(cashier);
        Assert.assertTrue(store.getCashierList().size() == 1);
    }

    @Test
    void fireCashier() {
        Store store = new Store("Shopwell", 120000);
        Manager manager = new Manager("Abc", store);
        Cashier cashier1 = new Cashier("gda", "2wwe", store);
        Cashier cashier2 = new Cashier("1gda", "2wwe", store);
        manager.hireCashier(cashier1);
        manager.hireCashier(cashier2);
        manager.fireCashier(cashier1);
        Assert.assertTrue(store.getCashierList().size() == 1);
    }
}