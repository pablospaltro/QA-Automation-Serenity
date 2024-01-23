package starter.actions.search;

import net.serenitybdd.screenplay.targets.Target;

public class SearchArticle {
    public static final Target BODY =  Target.the("title identifier").locatedBy(".mw-page-title-main");
}
