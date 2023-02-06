package org.example;

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

    public Product getProduct(String name) {
        for (Product product : productList) {
            if (product.getName().equals(name))
                return product;
        }
        return null;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(Product product) {
        this.productList.add(product);
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
        return storeBalance;
    }

    public void setStoreBalance(double storeBalance) {
        this.storeBalance = storeBalance;
    }

    public List<Cashier> getCashierList() {
        return cashierList;
    }

    public void setCashierList(Cashier cashier) {
        this.cashierList.add(cashier);
    }
}
