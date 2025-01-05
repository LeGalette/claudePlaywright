package pages;

import com.microsoft.playwright.Page;

public class ProductsPage extends BasePage {
    public ProductsPage(Page page) {
        super(page);
    }

    public void addBackpackToCart() {
        page.click("#add-to-cart-sauce-labs-backpack");
    }

    public void openCart() {
        page.click(".shopping_cart_link");
    }
}