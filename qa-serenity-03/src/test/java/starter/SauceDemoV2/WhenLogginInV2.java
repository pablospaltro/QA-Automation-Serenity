package starter.SauceDemoV2;


import net.serenitybdd.annotations.Managed;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SerenityJUnit5Extension.class)
public class WhenLogginInV2 {

    /*
    another approach to a login test
    without the template:
    all web driver actions and testing layer in one class
    (not a recommended practice)
     */

    @Managed
    WebDriver driver;

    /*
    'data-test' attributes are very useful when doing test automation
    they're ids specifically designed for testing
    without possible maintainability issues
    (good practice)
     */

    // driver shouldn't be in this class, only as an initial practice interaction:
    @Test
    public void userCanLoginViaTheHomePage(){
        driver.get("https://saucedemo.com");

        driver.findElement(By.cssSelector("[data-test='username']")).sendKeys("standard_user");
        driver.findElement(By.cssSelector("[data-test='password']")).sendKeys("secret_sauce");
        driver.findElement(By.cssSelector("[data-test='login-button']")).click();

        assertThat(driver.findElement(By.cssSelector(".title")).getText()).isEqualToIgnoringCase("Products");
    }
}
