package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    private By cookieCancelBtn = By.xpath("//*[@class='btn btn_gray cookie__cancel']"); //кнопка Отклонить куки
    private By nameOfBlock = By.xpath("//*[@class='pay']//h2"); //наименование блока
    private By logoVisa = By.xpath("//*[@class='pay__partners']//img[@alt='Visa']");//Лого Visa
    private By logoVerifiedByVisa = By.xpath("//*[@class='pay__partners']//img[@alt='Verified By Visa']");//Лого Verified By Visa
    private By logoMasterCard = By.xpath("//*[@class='pay__partners']//img[@alt='MasterCard']");//Лого MasterCard
    private By logoMasterCardSecureCode = By.xpath("//*[@class='pay__partners']//img[@alt='MasterCard Secure Code']");//Лого MasterCard Secure Code
    private By logoBelcard = By.xpath("//*[@class='pay__partners']//img[@alt='Белкарт']");//Лого Белкарт
    private By moreАboutServiceLink = By.xpath("//*[@href='/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/']");//Ссылка Подробнее о сервисе
    private By phoneNumberField = By.xpath("//*[@id='connection-phone']");//Поле Номер телефона
    private By sumField = By.xpath("//*[@id='connection-sum']");//Поле Сумма
    private By continueBut = By.xpath("//*[@id='pay-connection']//*[@type='submit']");//Кнопка Продолжить


    //Закрыть окно куки
    public void closeCookie() {
        driver.findElement(cookieCancelBtn).click();
    }

    //Получить название блока Онлайн пополнение без комиссии
    public String getNameOfBlock() {
        System.out.println(driver.findElement(nameOfBlock).getText());
        return driver.findElement(nameOfBlock).getText();
    }

    //Наличие лого Visa
    public boolean logoIsPresenceVisa() {
        return driver.findElement(logoVisa).isEnabled();
    }

    //Наличие лого Verified By Visa
    public boolean logoIsPresenceVerifiedByVisa() {
        return driver.findElement(logoVerifiedByVisa).isEnabled();
    }

    //Наличие лого MasterCard
    public boolean logoIsPresenceMasterCard() {
        return driver.findElement(logoMasterCard).isEnabled();
    }

    //Наличие лого MasterCard Secure Code
    public boolean logoIsPresenceMasterCardSecureCode() {
        return driver.findElement(logoMasterCardSecureCode).isEnabled();
    }

    //Наличие лого Visa
    public boolean logoIsPresenceBelcard() {
        return driver.findElement(logoBelcard).isEnabled();
    }

    //Клик по ссылке Подробнее о сервисе
    public AboutServicePage clickMoreАboutServiceLink() {
        driver.findElement(moreАboutServiceLink).click();
        return new AboutServicePage(driver);
    }

    //Заполнить поле Номер телефона
    public void fillPhoneNumberField(String tel) {
        driver.findElement(phoneNumberField).sendKeys(tel);
    }

    //Заполнить поле Сумма
    public void fillAmountField(String sum) {
        driver.findElement(sumField).sendKeys(sum);
    }

    //Клик по кнопке Продолжить
    public void clickContinueBut() {
        driver.findElement(continueBut).click();
    }
}