package org.example;

import java.util.List;

public interface VendingMachine {
    void initProducts(List<Product> list);

    Product getProduct(String name);
}
