package mystore.actions;

import mystore.constants.Constants;
import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;

@DefaultUrl(Constants.SIGN_IN_PAGE)
public class MyStoreHomePage extends PageObject {

    /*
    we could write the url directly inside the DefaultUrl,
    but for a better practice we should have it on an external file
    which we can modify only once (so we create the Constant)
    */
}
