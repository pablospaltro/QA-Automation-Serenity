package starter.SauceDemoV1.acceptancetests.actions.search;

import net.serenitybdd.screenplay.targets.Target;

class SearchForm {
    static Target SEARCH_FIELD = Target.the("search field").locatedBy("#searchbox_input");

}