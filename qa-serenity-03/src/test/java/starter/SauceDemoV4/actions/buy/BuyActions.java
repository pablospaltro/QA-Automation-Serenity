package starter.SauceDemoV4.actions.buy;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;
import starter.SauceDemoV4.actions.login.User;

public class BuyActions extends UIInteractions {

    @Step("Click on web element: {0}")
    public void clickOnWebElement(String element){
        find(element).click();
    }

    // for now selecting a specific product (then it should be random):
    @Step("Add product to the cart")
    public void addsProductToCart(){
        clickOnWebElement("[data-test='add-to-cart-sauce-labs-bolt-t-shirt']");
    }

    @Step("Go to the shopping cart container")
    public void goesToShoppingCartContainer(){
        clickOnWebElement(".shopping_cart_container");
    }

    @Step("Click on the checkout button")
    public void clicksCheckout(){
        clickOnWebElement("[data-test='checkout']");
    }

    @Step("Complete checkout information as {0}")
    public void completesCheckoutInformationAs(User user){

        find("[data-test='firstName']").sendKeys(user.getUsername());
        find("[data-test='lastName']").sendKeys(user.getPassword());
        find("[data-test='postalCode']").sendKeys(user.getPostalCode());

        clickOnWebElement("[data-test='continue']");
    }

    @Step("Click on the finish button")
    public void clicksOnFinish(){
        clickOnWebElement("[data-test='finish']");
    }
}
