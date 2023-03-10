package org.retailstore;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.retailstore.staff.Cashier;
import org.retailstore.staff.Manager;

import java.util.ArrayList;
import java.util.List;

class StoreTest {

    @Test
    void shouldGetProductFromStore() {
        Product product = new Product("Wine", 1200, 20);
        Store store = new Store("Shoprite", 200000);
        store.setProductList(product);
        Assert.assertEquals("Wine", store.getProduct(product.getName()).getName());
    }

    @Test
    void shouldGetProductListFromStore() {
        Product product = new Product("Wine", 1200, 20);
        Product product2 = new Product("Bread", 100, 20);
        Store store = new Store("Shoprite", 200000);
        Manager manager = new Manager("John Doe", store);
        manager.addProductToStore(product);
        manager.addProductToStore(product2);
        Assert.assertEquals(2, store.getProductList().size());
    }

    @Test
    void shouldSetProductListOfTheStore() {
        List<Product> products = new ArrayList<>();
        Product product = new Product("Fish", 12, 10);
        products.add(product);
        Store store = new Store("Shoprite", 10000);
        store.setProductList(product);
        Assert.assertEquals(1, store.getProductList().size());
    }

    @Test
    void shouldGetStoreBalance() {
        Store store = new Store("Shoprite", 10000);
        Assert.assertTrue(store.getStoreBalance() == 10000);
    }

    @Test
    void shouldGetCashierListContainingCashiersWorkingAtTheStore() {
        Store store = new Store("Shoprite", 10000);
        Cashier cashier = new Cashier("Hannah Berry", "1WEE", store);
        Cashier cashier2 = new Cashier("Hannah Yat", "1WEE", store);
        store.setCashierList(cashier);
        store.setCashierList(cashier2);
        List<Cashier> res = store.getCashierList();
        Assert.assertEquals(2, res.size());
    }

    @Test
    void shouldSetCashierList() {
        Store store = new Store("Shoprite", 10000);
        Cashier cashier = new Cashier("Hannah Berry", "1WEE", store);
        Cashier cashier2 = new Cashier("Hannah Yat", "1WEE", store);
        store.setCashierList(cashier);
        store.setCashierList(cashier2);
        Assert.assertEquals(2, store.getCashierList().size());
    }
}