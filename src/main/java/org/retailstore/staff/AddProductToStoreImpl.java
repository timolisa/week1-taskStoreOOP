package org.retailstore.staff;

import org.retailstore.Product;
import org.retailstore.Store;
import org.retailstore.staff.AddProductToStore;
import org.retailstore.staff.Manager;

public class AddProductToStoreImpl implements AddProductToStore {
    private Manager manager;
    private Store store;
    public AddProductToStoreImpl(Object other, Store store) {
        this.manager = (Manager) other;
        this.store = store;
    }

    @Override
    public void addProductToStore(Product product) {
        store.setProductList(product);
        System.out.println("Mr " + manager.getName() + " added " + product.getQuantity() + " units of " + product.getName());
    }
}
