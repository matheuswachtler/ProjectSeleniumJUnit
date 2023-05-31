package jUnitTest;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pageObject.InventoryPage;

public class InventoryTest implements InterfaceTest {

    InventoryPage inventoryPage = new InventoryPage();

    @Override
    @BeforeEach
    public void beforeEach() {
        inventoryPage.openBrowser();
    }

    @Override
    @AfterEach
    public void afterEach() {
        inventoryPage.closeBrowser();
    }

    @Test
    @Override
    public void isCurrentPage() {
        Assertions.assertTrue(inventoryPage.compareCurrentUrl());
        Assertions.assertNotNull(inventoryPage.findElementById(InventoryPage.getIdShoppingCart()));
    }

    @Test
    public void shouldAddItemToCart() {
        inventoryPage.findAndClickButtonById(InventoryPage.getIdAddItemToCart());
        Assertions.assertNotNull(inventoryPage.findElementById(InventoryPage.getIdRemoveItemToCart()));
    }

    @Test
    public void shouldRemoveItemToCart() {
        shouldAddItemToCart();
        inventoryPage.findAndClickButtonById(InventoryPage.getIdRemoveItemToCart());
        Assertions.assertNotNull(inventoryPage.findElementById(InventoryPage.getIdAddItemToCart()));
    }



}
