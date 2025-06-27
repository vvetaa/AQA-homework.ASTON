package lesson2_10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class PaySection extends BaseTest{

    private String blockTitleXpath = "//h2[contains(text(), 'Онлайн пополнение')]";
    private String logosXpath = "//div[@class='pay__partners']//li//img";
    private String nameLink = "Подробнее о сервисе";
    private String phoneNumberXpath = "//input[@placeholder='Номер телефона']";
    private String amountXpath = "//input[@placeholder='Сумма']";
    private String buttonXpath = "//form[@id='pay-connection']/button";




    //название блока Онлайн пополнение без комиссии
    public WebElement getBlockTitle() {
       return wait.until(ExpectedConditions.visibilityOfElementLocated(
               By.xpath(blockTitleXpath)));
    }

    //лого платежных систем
    public List<WebElement> getLogos() {
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
                By.xpath(logosXpath)));
    }

    //ссылка 'Подробнее о сервисе'
    public WebElement getLink() {
        return wait.until(ExpectedConditions.elementToBeClickable(
                By.linkText(nameLink)));
    }

    public WebElement getPhoneNumber() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath(phoneNumberXpath)));
    }

    public WebElement getAmount() {
        return driver.findElement(
                By.xpath(amountXpath));
    }

    public WebElement getButton() {
        return wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath(buttonXpath)));
    }
}
