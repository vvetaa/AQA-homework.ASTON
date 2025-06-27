package lesson2_10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class PaymentFrame extends BaseTest{

    private String sumXpath = "//div[@class='pay-description__cost']//span";
    private String infoXpath = "//div[@class='pay-description__cost']//span";
    private String cardNumberXpath = "//div[@class='pay-description__cost']//span";


    public WebElement getPaymentSum() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath(sumXpath)));
    }

    public WebElement getPaymentInfo() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath(infoXpath)));
    }

    public WebElement getCardNumberPlaceholder() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath(cardNumberXpath)));
    }

    public WebElement getCardDatePlaceholder() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//app-card-page//label[@class='ng-tns-c2312288139-4 ng-star-inserted']")));
    }

    public WebElement getCardCVCPlaceholder() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//app-card-page//label[@class='ng-tns-c2312288139-5 ng-star-inserted']")));
    }

    public WebElement getCardHolderPlaceholder() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//app-card-page//label[@class='ng-tns-c2312288139-3 ng-star-inserted']")));
    }

    public List<WebElement> getCardTypeIcons() {
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
                By.xpath("//app-card-input//img")));
    }

    public WebElement getCardSubmitButton() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//app-card-page//button[@type='submit']")));
    }
}
