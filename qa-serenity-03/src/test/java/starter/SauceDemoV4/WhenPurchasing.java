package starter.SauceDemoV4;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;

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

    @Before
    public void userLoginsIn(){
        login.as(User.STANDARD_USER);
    }

    // all methods involved in purchasing a product:
    @Test
    public void userCanPurchaseRandomProduct(){
        buyer.addsToCartTheProduct();
        buyer.goesToShoppingCartContainer();
        buyer.clicksCheckout();
        buyer.completesCheckoutInformationAs(User.STANDARD_USER);
        buyer.clicksOnFinish();
        Serenity.reportThat("The checkout complete page should include the correct text",
                () -> assertThat(checkoutCompletePage.getCompleteHeader()).isEqualToIgnoringCase("Thank you for your order!"));
    }


    // methods by every individual action and its assertion:

    @Test
    public void userCanAddToCartTheProduct(){
        buyer.addsToCartTheProduct();
        /*
        Serenity.reportThat("",
                () -> assertThat());

        */
    }

    @Test
    public void userCanAddToCartTheProduct(){
        buyer.addsToCartTheProduct();
        Target shoppingCart = inventoryPage.getShoppingCart();

        Serenity.reportThat("The shopping cart should include a '1'",
                () -> actor.should(
                        seeThat("The shopping cart should include a '1'", Text.of(shoppingCart), text("1"))
                )
        );
    }

    @Test
    public void userCanGoToShoppingCartContainer(){
        buyer.goesToShoppingCartContainer();
        /*
        Serenity.reportThat("",
                () -> assertThat());
        */
    }

    @Test
    public void userCanClickCheckout(){
        buyer.clicksCheckout();
        /*
        Serenity.reportThat("",
                () -> assertThat());
        */
    }

    @Test
    public void userCanCompleteCheckoutInformation(){
        buyer.completesCheckoutInformationAs(User.STANDARD_USER);
        /*
        Serenity.reportThat("",
                () -> assertThat());
        */
    }

    @Test
    public void userCanFinishThePurchase(){
        buyer.clicksOnFinish();

        // "Thank you for your order!" text should be displayed

        /*
        Serenity.reportThat("",
                () -> assertThat());
        */
    }
}
