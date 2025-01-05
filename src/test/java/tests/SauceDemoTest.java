package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class SauceDemoTest extends BaseTest {
    @Test
    public void testSauceDemoCheckout() {
        LoginPage loginPage = new LoginPage(page);
        ProductsPage productsPage = new ProductsPage(page);
        CartPage cartPage = new CartPage(page);
        CheckoutPage checkoutPage = new CheckoutPage(page);

        loginPage.navigateTo();
        loginPage.login("standard_user", "secret_sauce");

        productsPage.addBackpackToCart();
        productsPage.openCart();

        cartPage.proceedToCheckout();

        Assert.assertTrue(page.url().contains("checkout-step-one"));
    }
}