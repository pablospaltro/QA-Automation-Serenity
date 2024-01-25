package mystore.actions;

import mystore.ui.MainPage;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class GoToSection implements Task {
    // use this class for moving between header or navbar sections

    private Target targetSection;
    private static String chosenSection;

    public GoToSection(Target section){
        this.targetSection = section;
    }

    /*
    a performable element it's an element which may be performed
    by an actor */
    public static Performable myAccount(){
        chosenSection = "MyAccountSection";
        return Instrumented.instanceOf(GoToSection.class).withProperties(MainPage.SECTION_LOGIN);
    }

    public static Performable products(){
        chosenSection = "ProductsSection";
        return Instrumented.instanceOf(GoToSection.class).withProperties(MainPage.SECTION_PRODUCTS);
    }

    // so far we are not making the selection (the click action) yet, so we add a step:
    // we need to specify a given section,
    // the gherkin step needs to be able to receive this chosenSection
    @Override
    @Step("{0} decide navigate to section: #chosenSection")
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Click.on(this.targetSection));
    }
}
