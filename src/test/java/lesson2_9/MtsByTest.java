package lesson2_9;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MtsByTest {

    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeEach
    void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.mts.by/");
        try {
            WebElement cookieButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='cookie-agree']")));
            cookieButton.click();
        } catch (Exception ignored) {
        }
    }

    @AfterEach
    void teardown() {
        driver.quit();
    }

    @Test
    @DisplayName("Проверка названия блока 'Онлайн пополнение без комиссии'")
    void testBlockTitle() {
        WebElement blockTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//section[@class='pay']//h2")));
        String expectedTitle = "Онлайн пополнение\nбез комиссии";
        String actualTitle = blockTitle.getText();
        assertEquals(expectedTitle, actualTitle, "Название блока не соответствует ожидаемому");
    }

    @Test
    @DisplayName("Проверка наличия логотипов платёжных систем")
    void testLogos() {
        List<WebElement> logos = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='pay__partners']//li//img")));
        assertFalse(logos.isEmpty());
    }

    @Test
    @DisplayName("Проверка работы ссылки 'Подробнее о сервисе'")
    void testLink() {
        WebElement link = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='pay__wrapper']//a")));
        link.click();
        String correctLink = "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/";
        assertTrue(driver.getCurrentUrl().contains(correctLink), "Открыт неверный URL");
    }

    @Test
    @DisplayName("Проверка формы пополнения, вариант - 'Услуги связи'")
    void testButton() {
        WebElement phoneNumber = driver.findElement(By.xpath("//input[@placeholder='Номер телефона']"));
        phoneNumber.click();
        phoneNumber.sendKeys("297777777");

        WebElement amount = driver.findElement(By.xpath("//input[@placeholder='Сумма']"));
        amount.click();
        amount.sendKeys("50");

        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//form[@id='pay-connection']/button")));
        button.click();

        WebElement paymentForm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//iframe[@class='bepaid-iframe']")));
        assertTrue(paymentForm.isDisplayed(), "Окно оплаты не появилось");
    }
}