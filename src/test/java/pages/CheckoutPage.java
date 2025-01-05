package pages;

import com.microsoft.playwright.Page;

public class CheckoutPage extends BasePage {
    public CheckoutPage(Page page) {
        super(page);
    }

    public void fillCheckoutInfo(String firstName, String lastName, String postalCode) {
        page.fill("#first-name", firstName);
        page.fill("#last-name", lastName);
        page.fill("#postal-code", postalCode);
        page.click("#continue");
    }
}