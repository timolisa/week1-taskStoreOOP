package org.retailstore;

import org.retailstore.staff.AddProductToStoreImpl;
import org.retailstore.staff.Cashier;
import org.retailstore.staff.Manager;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private String name;
    private List<Product> productsStock;
    private List<Cashier> cashiers;
    private double accountBalance;

    public Store(String name, double accountBalance) {
        this.name = name;
        this.productsStock = new ArrayList<>();
        this.cashiers = new ArrayList<>();
        this.accountBalance = accountBalance;
    }

    public String getStoreName() {
        return name;
    }

    public Product getProduct(String name) {
        for (Product product : productsStock) {
            if (product.getName().equals(name))
                return product;
        }
        return null;
    }

    public List<Product> getProductList() {
        return productsStock;
    }

    public void setProductList(Product product) {
        this.productsStock.add(product);
    }

    public AddProductToStoreImpl addProductToCatalog(Object other) {
        if (other instanceof Manager)
            return new AddProductToStoreImpl(other, this);
        else {
            System.out.println("Only the manager can add products to the catalog.");
            return null;
        }
    }

    public double getStoreBalance() {
        return accountBalance;
    }

    public void setStoreBalance(double storeBalance) {
        this.accountBalance = storeBalance;
    }

    public List<Cashier> getCashierList() {
        return cashiers;
    }

    public void setCashierList(Cashier cashier) {
        this.cashiers.add(cashier);
    }
}
