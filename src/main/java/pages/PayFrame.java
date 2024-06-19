package pages;

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

    public void switchToFrame() throws InterruptedException {
        sleep(2500);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.bepaid-app__container iframe")));
        WebElement framePay = driver.findElement(By.cssSelector("div.bepaid-app__container iframe"));
        driver.switchTo().frame(framePay);
    }

    public String getAmountOnHeader() {
        return driver.findElement(amountInHeader).getText();
    }

    public String getAmountOnButton() {
        return driver.findElement(amountInButton).getText();
    }

    public String lineWithPhoneNumber() {
        return driver.findElement(phoneNumberStr).getText();
    }

    public String getCardNumberField() {
        return driver.findElement(cardNumberField).getText();
    }

    public String getCardExpiryDateField() {
        return driver.findElement(cardExpiryDateField).getText();
    }

    public String getCardCVCField() {
        return driver.findElement(cardCVCField).getText();
    }

    public String getCardHolderNameField() {
        return driver.findElement(cardHolderNameField).getText();
    }

    public int numberPaymentSystemIcons() {
        return driver.findElements(cardIcons).size();
    }
}