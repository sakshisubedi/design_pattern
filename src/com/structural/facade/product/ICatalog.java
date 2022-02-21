package com.structural.facade.product;

import java.util.List;

public interface ICatalog {
    List<Object> getAllItems();
    List<Object> searchItem(String item);

    // ADMIN team client that manages inventory
    List<Object> updateCatalog();
    Object addItemToCatalog();
}
