package starter.SauceDemoV1.acceptancetests.actions.search;

import net.serenitybdd.screenplay.targets.Target;

public class InputForm {
    static Target USERNAME_FORM_INPUT= Target.the("user-name").locatedBy("#user-name");

    static Target PASSWORD_FORM_INPUT= Target.the("password").locatedBy("#password");
}
