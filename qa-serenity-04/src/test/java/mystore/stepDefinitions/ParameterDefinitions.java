package mystore.stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.ParameterType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ParameterDefinitions {


    // ".*" --> everybody is allowed, in order to match any actor names
    // the stage is the platform where actors and actions are going to happen
    @ParameterType(".*")
    public Actor actor(String actorName){
        return OnStage.theActorCalled(actorName);
    }


    // we need to start/set the stage before working.
    /*
    Online cast is going to be equipped with a web driver,
    so we won't need to specify it in the tests.
    We'll work with features as test files
    so in the features we won't be able to define the driver.
     */
    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }
}
