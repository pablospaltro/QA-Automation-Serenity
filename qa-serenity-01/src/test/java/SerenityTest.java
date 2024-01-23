import net.serenitybdd.annotations.Narrative;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.annotations.WithTag;
import net.serenitybdd.annotations.WithTags;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@Narrative(text = {"This is a sample Serenity BDD test."})
@WithTags({@WithTag("sample")})
@ExtendWith(SerenityJUnit5Extension.class)
public class SerenityTest {

    @Steps
    SampleSteps sampleSteps;

    @Test
    public void verifySerenityBDDSetup() {
        sampleSteps.performSomeAction(4, 6);
        sampleSteps.verifyResult(10, sampleSteps.getResult());
    }
}


