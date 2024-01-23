import net.serenitybdd.annotations.Step;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SampleSteps {

    private int result;

    public int getResult() {
        return result;
    }

    @Step
    public void performSomeAction(int number1, int number2) {
        result = number1 + number2;
    }
    @Step
    public void verifyResult(int expectedResult, int actualResult) {

        assertEquals(expectedResult, result);

    }
}
