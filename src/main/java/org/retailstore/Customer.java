package org.retailstore;

import java.util.ArrayList;

public class Customer extends Person {
    private double creditCardBalance;
    private ArrayList<Product> cart;

    public Customer(String name, double creditCardBalance) {
        super(name);
        this.creditCardBalance = creditCardBalance;
        this.cart = new ArrayList<>();
    }
    public void makePayment(double amount) {
        creditCardBalance -= amount;
    }

    public double getCreditCardBalance() {
        System.out.println("Balance " + creditCardBalance);
        return creditCardBalance;
    }

    public void addToCart(Product product, Integer quantity) {
        Product selectedProduct = new Product(product.getName(), product.getPrice(), quantity);
        cart.add(selectedProduct);
    }

    public ArrayList<Product> getCart() {
        return cart;
    }
}

