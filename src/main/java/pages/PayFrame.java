package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static java.lang.Thread.sleep;

public class PayFrame {
    private WebDriver driver;

    public PayFrame(WebDriver driver) {
        this.driver = driver;
    }

    private By amountInHeader = By.xpath("//*[@class='pay-description__cost']");
    private By amountInButton = By.xpath("//*[@class='colored disabled']");
    private By phoneNumberStr = By.xpath("//*[@class='pay-description__text']");
    private By cardNumberField = By.xpath("//*[@class='ng-tns-c46-1 ng-star-inserted']");
    private By cardExpiryDateField = By.xpath("//*[@class='ng-tns-c46-4 ng-star-inserted']");
    private By cardCVCField = By.xpath("//*[@class='ng-tns-c46-5 ng-star-inserted']");
    private By cardHolderNameField = By.xpath("//*[@class='content ng-tns-c46-3']");
    private By cardIcons = By.xpath("//*[@class='ng-tns-c61-0 ng-star-inserted']");

    @Step("Открыть фрейм")
    public void switchToFrame() throws InterruptedException {
        sleep(2500);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        //WebElement framePay = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.bepaid-app__container iframe")));
        WebElement framePay = driver.findElement(By.cssSelector("div.bepaid-app__container iframe"));
        driver.switchTo().frame(framePay);
    }

    @Step("Получить сумму из заголовка")
    public String getAmountOnHeader() {
        return driver.findElement(amountInHeader).getText();
    }
@Step("Получить сумму из кнопки Продолжить")
    public String getAmountOnButton() {
        return driver.findElement(amountInButton).getText();
    }

    @Step("Получить номер телефора")
    public String lineWithPhoneNumber() {
        return driver.findElement(phoneNumberStr).getText();
    }

    @Step("Получить текст из поля Номер карты")
    public String getCardNumberField() {
        return driver.findElement(cardNumberField).getText();
    }

    @Step("Текст из поля Срок действия карты")
    public String getCardExpiryDateField() {
        return driver.findElement(cardExpiryDateField).getText();
    }

    @Step("Текст из поля CVC")
    public String getCardCVCField() {
        return driver.findElement(cardCVCField).getText();
    }

    @Step("Текст из поля Имя владельца")
    public String getCardHolderNameField() {
        return driver.findElement(cardHolderNameField).getText();
    }

    @Step("Проверка иконок платежных систем")
    public int numberPaymentSystemIcons() {
        return driver.findElements(cardIcons).size();
    }
}