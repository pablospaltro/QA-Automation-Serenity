package starter.SauceDemoV4.actions.buy;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;
import starter.SauceDemoV4.actions.search.InputForm;

public class AddProduct {

    public static Performable toCart(String element) {
        return Task.where("{0} adds product to the cart '",
                Click.on(element)
        );
    }
}
