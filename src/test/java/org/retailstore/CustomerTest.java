package org.retailstore;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.retailstore.Customer;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void shouldCreateACustomer() {
        Customer customer = new Customer("Jary", 2000);
        Assert.assertTrue(!customer.getName().equals(null));
        Assert.assertTrue(customer.getCreditCardBalance() ==2000);
        Assert.assertFalse(customer.getCart().size() == 1);
    }

    @Test
    void shouldGetCustomerCreditCardBalance() {
        Customer customer = new Customer("Jary", 2000);
        double bal = customer.getCreditCardBalance();
        Assert.assertTrue(bal == 2000);
    }

    @Test
    void shouldMakePayment() {
        Customer customer = new Customer("Jary", 2000);
        customer.makePayment(1000.0);
        Assert.assertTrue(customer.getCreditCardBalance() == 1000.0);
    }

    @Test
    void shouldAddProductToCart() {
        Customer customer = new Customer("Jary", 2000);
        Product product = new Product("Yam", 1200, 3);
        customer.addToCart(product, 1);
        Assert.assertEquals(1, customer.getCart().size());
    }
}