package lesson2_10;

public class PaySectionSteps {

    PaySection paySection = new PaySection();

    public PaySectionSteps fillPhoneNumber(String phone) {
        paySection.getPhoneNumber().click();
        paySection.getPhoneNumber().sendKeys(phone);
        return this;
    }

    public PaySectionSteps fillAmount(String amount) {
        paySection.getAmount().click();
        paySection.getAmount().sendKeys(amount);
        return this;
    }
}
