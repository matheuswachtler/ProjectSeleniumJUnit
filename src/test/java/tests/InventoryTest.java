package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.InventoryPage;

public class InventoryTest extends BaseTest {

    @Test
    public void shouldAddItemToCart() {
        InventoryPage inventoryPage = new InventoryPage(getDriver());
        inventoryPage.navigate(InventoryPage.URL_INVENTORY_PAGE);
        inventoryPage.isThere(InventoryPage.URL_INVENTORY_PAGE);
        inventoryPage.findAndClickButtonById(InventoryPage.ID_ADD_ITEM_TO_CART);
        Assertions.assertNotNull(inventoryPage.elementIsPresent(InventoryPage.ID_REMOVE_ITEM_TO_CART));
        Assertions.assertNotNull(inventoryPage.elementIsPresent(InventoryPage.ID_SHOPPING_CART));
    }

    @Test
    public void shouldRemoveItemToCart() {
        InventoryPage inventoryPage = new InventoryPage(getDriver());
        inventoryPage.navigate(InventoryPage.URL_INVENTORY_PAGE);
        inventoryPage.isThere(InventoryPage.URL_INVENTORY_PAGE);
        inventoryPage.findAndClickButtonById(InventoryPage.ID_ADD_ITEM_TO_CART);
        Assertions.assertNotNull(inventoryPage.elementIsPresent(InventoryPage.ID_REMOVE_ITEM_TO_CART));
        Assertions.assertNotNull(inventoryPage.elementIsPresent(InventoryPage.ID_SHOPPING_CART));
        inventoryPage.findAndClickButtonById(InventoryPage.ID_REMOVE_ITEM_TO_CART);
        Assertions.assertNotNull(inventoryPage.elementIsPresent(InventoryPage.ID_ADD_ITEM_TO_CART));
        Assertions.assertNotNull(inventoryPage.elementIsPresent(InventoryPage.ID_SHOPPING_CART));
    }

}

