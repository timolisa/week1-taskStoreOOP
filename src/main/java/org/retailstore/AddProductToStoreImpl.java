package org.retailstore;

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
