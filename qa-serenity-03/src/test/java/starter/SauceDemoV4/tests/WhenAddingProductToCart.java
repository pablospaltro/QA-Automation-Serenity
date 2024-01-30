package starter.SauceDemoV4.tests;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.annotations.CastMember;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import net.serenitybdd.screenplay.questions.Text;
import starter.SauceDemoV4.actions.buy.AddProduct;
import starter.SauceDemoV4.actions.buy.InventoryItem;
import starter.SauceDemoV4.actions.navigation.NavigateTo;
import starter.SauceDemoV4.actions.search.LogIn;

public class WhenAddingProductToCart {

    @CastMember
    Actor actor;


    @Test
    @DisplayName("Should be able to add product to cart")
    void addingAProduct() {
        actor.attemptsTo(
                NavigateTo.theHomePage(),
                LogIn.as("standard_user", "secret_sauce"),
                AddProduct.toCart("[data-test='add-to-cart-sauce-labs-bolt-t-shirt']"),
                NavigateTo.theCartPage()
        );

        actor.should(
                seeThat("The product is in the cart", Text.of(InventoryItem.ITEM_NAME_ELEMENT), equalToIgnoringCase("Sauce Labs Bolt T-Shirt"))
        );
    }
}
