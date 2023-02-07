package org.retailstore.staff;

import org.retailstore.*;

import java.util.List;

public class Manager extends Person {
    private Store store;

    public Manager(String name, Store store) {
        super(name);
        this.store = store;
    }

    public void hireCashier(Cashier cashier) {
        store.setCashierList(cashier);
    }

    public void fireCashier(Cashier cashier) {
        List<Cashier> cashiers = store.getCashierList();
        for (Cashier c : cashiers) {
            if (c.getName().equals((cashier.getName())))
                cashiers.remove(c);
        }
    }

    public void addProductToStore(Product product) {
        AddProductToStoreImpl access = store.addProductToCatalog(this);
        access.addProductToStore(product);
    }
}
