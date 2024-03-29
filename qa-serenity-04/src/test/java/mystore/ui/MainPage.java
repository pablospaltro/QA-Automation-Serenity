package mystore.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MainPage {

    //serenity tools using the screenplay pattern

    public static final Target SECTION_PRODUCTS = Target.the("Products section in main page")
            .located(By.cssSelector("a[href='/products']"));

    public static final Target SECTION_LOGIN = Target.the("Login section in main page")
            .located(By.cssSelector("a[href='/login']"));
}
