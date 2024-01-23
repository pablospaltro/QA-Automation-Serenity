package starter.SauceDemoV4;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.steps.UIInteractions;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SerenityJUnit5Extension.class)
public class WhenLoggingInV4 {

    /*
    As a test class,
    it should only do that: test.
    it shouldn´t extend from UIInteractions / PageObject
    since its propose is completely different
    (Single Responsibility Principle)

    That's why we use separated classes
    such as LoginActions ( interacting with the user data )
    and InventoryPage ( interacting with the page / web element )

        additional info:
        Also as a good practice, we should structure the project
        creating packages separating:
        - pages / actions / actor / test cases

          (Which elements are going to be just Pages
          and which ones just Actions.
          We don't have a page with actions,
          they're separated.)
     */

    @Managed
    WebDriver driver;

    // we separate the web elements interaction from the testing layer:
    @Steps
    LoginActions login;
    InventoryPage inventoryPage;

    @Test
    public void userCanLoginViaTheHomePage(){
        login.as(User.STANDARD_USER);
        Serenity.reportThat("The inventory page should include the correct text",
                () -> assertThat(inventoryPage.getHeading()).isEqualToIgnoringCase("Products")
                );
    }
}
