package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.InventoryPage;

public class InventoryTest extends BaseTest {

    InventoryPage inventoryPage = new InventoryPage();

    @Test
    public void shouldAddItemToCart() {
        inventoryPage.navigate(this.webDriver);
        inventoryPage.findAndClickButtonById(this.webDriver,InventoryPage.getIdAddItemToCart());
        Assertions.assertNotNull(inventoryPage.elementIsPresent(this.webDriver,InventoryPage.getIdRemoveItemToCart()));
    }

    @Test
    public void shouldRemoveItemToCart() {
        shouldAddItemToCart();
        inventoryPage.findAndClickButtonById(this.webDriver,InventoryPage.getIdRemoveItemToCart());
        Assertions.assertNotNull(inventoryPage.elementIsPresent(this.webDriver,InventoryPage.getIdAddItemToCart()));
    }

}

