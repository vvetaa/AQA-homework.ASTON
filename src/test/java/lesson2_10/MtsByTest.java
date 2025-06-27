package lesson2_10;

import org.junit.jupiter.api.Test;

public class MtsByTest extends BaseTest{

    PaySectionSteps paySectionSteps = new PaySectionSteps();

    @Test
    public void testForm() {
        String phoneNumber = "297777777";
        String sum = "50";
        paySectionSteps
                .fillPhoneNumber(phoneNumber)
                .fillAmount(sum);
    }
}
