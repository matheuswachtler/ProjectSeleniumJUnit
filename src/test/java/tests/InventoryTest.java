package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.InventoryPage;

public class InventoryTest extends BaseTest {

    InventoryPage inventoryPage = new InventoryPage();

    @Test
    public void isCurrentPage(){
        inventoryPage.navigateToUrl(this.webDriver, InventoryPage.getUrlInventoryPage());
        Assertions.assertTrue(inventoryPage.compareCurrentUrl(this.webDriver,InventoryPage.getUrlInventoryPage()));
        Assertions.assertNotNull(inventoryPage.findElementById(this.webDriver,InventoryPage.getIdAddItemToCart()));
        Assertions.assertNotNull(inventoryPage.findElementById(this.webDriver,InventoryPage.getIdShoppingCart()));
    }

    @Test
    public void shouldAddItemToCart() {
        inventoryPage.navigateToUrl(this.webDriver, InventoryPage.getUrlInventoryPage());
        inventoryPage.findAndClickButtonById(this.webDriver,InventoryPage.getIdAddItemToCart());
        Assertions.assertNotNull(inventoryPage.findElementById(this.webDriver,InventoryPage.getIdRemoveItemToCart()));
    }

    @Test
    public void shouldRemoveItemToCart() {
        shouldAddItemToCart();
        inventoryPage.findAndClickButtonById(this.webDriver,InventoryPage.getIdRemoveItemToCart());
        Assertions.assertNotNull(inventoryPage.findElementById(this.webDriver,InventoryPage.getIdAddItemToCart()));
    }

}

