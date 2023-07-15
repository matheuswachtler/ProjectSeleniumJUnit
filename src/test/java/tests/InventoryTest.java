package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.InventoryPage;

public class InventoryTest extends BaseTest {

    InventoryPage inventoryPage = new InventoryPage();

    @Test
    public void shouldAddItemToCart() {
        inventoryPage.navigate();
        inventoryPage.isThere();
        inventoryPage.findAndClickButtonById(InventoryPage.ID_ADD_ITEM_TO_CART);
        Assertions.assertNotNull(inventoryPage.elementIsPresent(InventoryPage.ID_REMOVE_ITEM_TO_CART));
        Assertions.assertNotNull(inventoryPage.elementIsPresent(InventoryPage.ID_SHOPPING_CART));
    }

    @Test
    public void shouldRemoveItemToCart() {
        shouldAddItemToCart();
        inventoryPage.findAndClickButtonById(InventoryPage.ID_REMOVE_ITEM_TO_CART);
        Assertions.assertNotNull(inventoryPage.elementIsPresent(InventoryPage.ID_ADD_ITEM_TO_CART));
        Assertions.assertNotNull(inventoryPage.elementIsPresent(InventoryPage.ID_SHOPPING_CART));
    }

}

