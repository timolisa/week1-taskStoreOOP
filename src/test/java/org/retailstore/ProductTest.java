package org.retailstore;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class ProductTest {

    @Test
    void getName() {
        Product product = new Product("Bread", 100.0, 30);
        Assert.assertTrue( product.getName() == "Bread");
    }

    @Test
    void getPrice() {
        Product product = new Product("Bread", 100.0, 30);
        Assert.assertTrue(product.getPrice() == 100);
    }

    @Test
    void getQuantity() {
        Product product = new Product("Garri", 10, 1000);
        Assert.assertTrue(product.getQuantity() == 1000);
    }

    @Test
    void setPrice() {
        Product product = new Product("Garri", 10, 1000);
        product.changePriceOfProduct(1000);
        Assert.assertTrue(product.getPrice() == 1000);
    }


}