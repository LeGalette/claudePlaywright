package pages;

import com.microsoft.playwright.Page;

public class CartPage extends BasePage {
    public CartPage(Page page) {
        super(page);
    }

    public void proceedToCheckout() {
        page.click("#checkout");
    }
}