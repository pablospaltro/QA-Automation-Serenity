package mystore.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MyAccountPage {

    /*
     previously logged, we're checking
     if the message "Logged in as Name Lastname" is correct

        for good practices avoid using xpath,
        but in this case it can work because of
        the possible stability and maintainability of this locator,
        which would be very easy to be modified later
     */

    public static final Target LOGIN_STATUS = Target.the("My Login status")
            .located(By.xpath("//*[text()=' Logged in as ']"));
}
