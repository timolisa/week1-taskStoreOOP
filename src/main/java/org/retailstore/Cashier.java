package org.retailstore;

import java.util.ArrayList;

public class Cashier extends Person{
        private String staffID;
        private Store store;
        private int customersAttendedTo = 0;

        public Cashier(String name, String staffID, Store store) {
            super(name);
            this.staffID = staffID;
            this.store = store;
        }

        public String getStaffID() {
            return staffID;
        }

        public void updateProductQuantity(Product product, int quantity) {
            for (Product storeProduct : store.getProductList()) {
                if (storeProduct.getName().equals(product.getName())) {
                    storeProduct.setQuantity(storeProduct.getQuantity() - quantity);
                    break;
                }
            }
        }

        public void checkOut(Customer customer) {
            double total = 0.0;
            for (Product product : store.getProductList()) {
                for (Product item : customer.getCart()) {
                    if (product.getName().equals(item.getName())) {
                        total += item.getQuantity() * item.getPrice();
                        updateProductQuantity(item, item.getQuantity());
                    }
                }
            }

            if (customer.getCreditCardBalance() >= total) {
                customer.makePayment(total);
                store.setStoreBalance(store.getStoreBalance() + total);
                issueReceipt(customer, customer.getCart(), total);
            }
        }

        private void issueReceipt(Customer customer, ArrayList<Product> products, double totalPrice) {
            System.out.println();
            System.out.println("RECEIPT");
            System.out.println("Name: " + customer.getName());
            for (Product item : products)
                System.out.println(item.toString());
            System.out.println("Total: " + totalPrice);
            System.out.println("Attended to by: " + getName() + " " + staffID);
            customer.getCart().clear();
            customersAttendedTo++;
        }

        public void getCustomersAttendedTo() {
            System.out.println(getName() + " attended to " + customersAttendedTo +  " clients.");
        }

}
