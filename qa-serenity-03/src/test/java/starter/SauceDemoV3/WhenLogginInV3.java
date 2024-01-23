package starter.SauceDemoV3;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.core.steps.UIInteractions;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SerenityJUnit5Extension.class)
public class WhenLogginInV3 extends UIInteractions {

    /*
    we still do all in one class,
    now extending UIInteractions
    for a better interaction with the web elements
     */

    @Managed
    WebDriver driver;

    @Test
    public void userCanLoginViaTheHomePage(){
        openUrl("https://saucedemo.com");

        find("[data-test='username']").sendKeys("standard_user");
        find("[data-test='password']").sendKeys("secret_sauce");
        find("[data-test='login-button']").click();

        assertThat(find(".title").getText()).isEqualToIgnoringCase("Products");
    }
}
