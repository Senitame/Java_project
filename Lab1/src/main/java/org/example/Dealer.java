package org.example;

class Dealer {
    public void sell(saleOfGoods item, Customer customer) {
        System.out.println("Dealer sells:");
        item.displayInfo();
        customer.purchase(item);
    }
}
