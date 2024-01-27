package starter.SauceDemoV4.tests;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import starter.SauceDemoV4.actions.buy.BuyActions;
import starter.SauceDemoV4.actions.login.LoginActions;
import starter.SauceDemoV4.actions.login.User;
import starter.SauceDemoV4.actions.navigation.CartPage;
import starter.SauceDemoV4.actions.navigation.CheckoutCompletePage;
import starter.SauceDemoV4.actions.navigation.InventoryPage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SerenityJUnit5Extension.class)
public class WhenPurchasing {

    @Managed
    WebDriver driver;

    @Steps
    LoginActions login;
    BuyActions buyer;
    InventoryPage inventoryPage;
    CheckoutCompletePage checkoutCompletePage;
    CartPage cartPage;

    @Before
    public void userLoginsIn(){
        login.as(User.STANDARD_USER);
    }

    // all methods involved in purchasing a product:
    @Test
    public void userCanPurchaseRandomProduct(){
        buyer.addsProductToCart();
        buyer.goesToShoppingCartContainer();
        buyer.clicksCheckout();
        buyer.completesCheckoutInformationAs(User.STANDARD_USER);
        buyer.clicksOnFinish();
        Serenity.reportThat("The checkout complete page should include the correct text",
                () -> assertThat(checkoutCompletePage.getCompleteHeader()).isEqualToIgnoringCase("Thank you for your order!"));
    }


    // methods by every individual action and its assertion:

    @Test
    public void userCanAddProductToCart(){
        buyer.addsProductToCart();
        Serenity.reportThat("The shopping cart should include a '1'",
                () -> assertThat(inventoryPage.getAmountOfProductsAddedInShoppingCart()).isEqualToIgnoringCase("1"));
    }

    @Test
    public void userCanGoToShoppingCartContainer(){
        buyer.goesToShoppingCartContainer();
        Serenity.reportThat("The cart page should include the correct text",
                () -> assertThat(cartPage.getHeading()).isEqualToIgnoringCase("Your Cart"));
    }

    @Test
    public void userCanGoToCheckout(){
        buyer.clicksCheckout();
        Serenity.reportThat("The checkout-step-one page should include the correct text",
                () -> assertThat(cartPage.getHeading()).isEqualToIgnoringCase("Checkout: Your Information"));
    }

    @Test
    public void userCanCompleteCheckoutInformation(){
        buyer.completesCheckoutInformationAs(User.STANDARD_USER);
        Serenity.reportThat("The checkout-step-two page should include the correct text",
                () -> assertThat(cartPage.getHeading()).isEqualToIgnoringCase("Checkout: Overview"));
    }

    @Test
    public void userCanFinishThePurchase(){
        buyer.clicksOnFinish();
        Serenity.reportThat("The checkout complete page should include the correct text",
                () -> assertThat(checkoutCompletePage.getCompleteHeader()).isEqualToIgnoringCase("Thank you for your order!"));
    }
}
