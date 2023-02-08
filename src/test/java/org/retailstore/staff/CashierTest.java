package org.retailstore.staff;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.retailstore.Customer;
import org.retailstore.Product;
import org.retailstore.Store;

import static org.junit.jupiter.api.Assertions.*;

class CashierTest {

    @Test
    void shouldCreateCashier() {
        Store store = new Store("ShopWell", 120000);
        Cashier cashier = new Cashier("Angela", "2ee1", store);
        Assert.assertEquals("Angela", cashier.getName());
        Assert.assertEquals("2ee1", cashier.getStaffID());
    }

    @Test
    void shouldUpdateProductQuantity() {
        Store store = new Store("ShopWell", 120000);
        Manager manager = new Manager("ABC", store);
        Product product = new Product("Milk", 120, 10);
        manager.addProductToStore(product);
        Cashier cashier = new Cashier("Angela", "2ee1", store);
        cashier.updateProductQuantity(product, 2);
        Assert.assertEquals(8, product.getQuantity());
    }

    @Test
    void shouldCheckOutCustomer() {
        Store store = new Store("ShopWell", 120000);
        Manager manager = new Manager("ABC", store);
        Cashier cashier = new Cashier("abc", "TEY11", store);
        Product product = new Product("Milk", 120, 10);
        manager.addProductToStore(product);
        Customer customer = new Customer("Jay", 20000);
        customer.addToCart(product, 2);
        cashier.checkOut(customer);
        Assert.assertTrue(store.getStoreBalance() == 120240);
    }

    @Test
    void shouldGetCustomersAttendedTo() {
        Store store = new Store("ShopWell", 120000);
        Manager manager = new Manager("ABC", store);
        Cashier cashier = new Cashier("abc", "TEY11", store);
        Product product = new Product("Milk", 120, 10);
        manager.addProductToStore(product);
        Customer customer = new Customer("Jay", 20000);
        customer.addToCart(product, 2);
        cashier.checkOut(customer);
        Assert.assertTrue(cashier.getCustomersAttendedTo() == 1);
    }
}