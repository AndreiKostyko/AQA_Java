package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private static WebDriver driver;

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

    //Клик по кнопке Продолжить и переход в фрейм
    public PayFrame clickContinueButToFrame() {
        driver.findElement(continueBut).click();
        return new PayFrame(driver);
    }


    public static class ListWhatToPay {
        //1. Проверить надписи в незаполненных полях каждого варианта оплаты услуг: услуги связи, домашний интернет, рассрочка, задолженность;

        private By listWhatToPay = By.xpath("//*[@class='select__now']");//Выпадающий список
        private By communicationServicesPoint = By.xpath("//p[text()='Услуги связи']");
        private By homeInternetPoint = By.xpath("//p[text()='Домашний интернет']");
        private By installmentsPoint = By.xpath("//p[text()='Рассрочка']");
        private By arrearsPoint = By.xpath("//p[text()='Задолженность']");
        private By phoneNumberFieldForConnection = By.xpath("//*[@id='connection-phone']");//Надпись в поле Номер телефона для Услуги связи
        private By phoneNumberFieldForInternet = By.xpath("//*[@id='internet-phone']");//Надпись в поле Номер телефона для Домашний интернет
        private By sumFieldForConnection = By.xpath("//*[@id='connection-sum']");//Поле Сумма
        private By sumFieldForInternet = By.xpath("//*[@id='internet-sum']");//Поле Сумма
        private By sumFieldForInstallments = By.xpath("//*[@id='instalment-sum']");//Поле Сумма
        private By sumFieldForArrears = By.xpath("//*[@id='arrears-sum']");//Поле Сумма
        private By emailFieldForConnection = By.xpath("//*[@id='connection-email']");//Поле емейл
        private By emailFieldForInternet = By.xpath("//*[@id='internet-email']");//Поле емейл
        private By emailFieldForInstalments = By.xpath("//*[@id='instalment-email']");//Поле емейл
        private By emailFieldForArrears = By.xpath("//*[@id='arrears-email']");//Поле емейл
        private By numberIfInstalmentsField = By.xpath("//*[@id='score-instalment']");//номер рассрочки
        private By numberIfArrearsField = By.xpath("//*[@id='score-arrears']");//номер задолженности

        private void openListWhatToPay() {
            driver.findElement(listWhatToPay).click();
        }

        public void selectCommunicationServicesPoint() {
            openListWhatToPay();
            driver.findElement(communicationServicesPoint).click();
        }

        public void selectHomeInternetPoint() {
            openListWhatToPay();
            driver.findElement(homeInternetPoint).click();
        }

        public void selectInstallmentsPoint() {
            openListWhatToPay();
            driver.findElement(installmentsPoint).click();
        }

        public void selectArrearsPoint() {
            openListWhatToPay();
            driver.findElement(arrearsPoint).click();
        }

        public String getPhoneNumberFieldTextForConnection() {
            return driver.findElement(phoneNumberFieldForConnection).getAttribute("placeholder");
        }

        public String getPhoneNumberFieldTextForInternet() {
            return driver.findElement(phoneNumberFieldForInternet).getAttribute("placeholder");
        }

        public String getSumFieldTextForConnection() {
            return driver.findElement(sumFieldForConnection).getAttribute("placeholder");
        }

        public String getSumFieldTextForInternet() {
            return driver.findElement(sumFieldForInternet).getAttribute("placeholder");
        }

        public String getEmailFieldForConnection() {
            return driver.findElement(emailFieldForConnection).getAttribute("placeholder");
        }

        public String getEmailFieldForInternet() {
            return driver.findElement(emailFieldForInternet).getAttribute("placeholder");
        }

        public String getNumberIfInstalmentsFieldText() {
            return driver.findElement(numberIfInstalmentsField).getAttribute("placeholder");
        }

        public String getSumFieldTextForInstalments() {
            return driver.findElement(sumFieldForInstallments).getAttribute("placeholder");
        }

        public String getEmailFieldForInstalments() {
            return driver.findElement(emailFieldForInstalments).getAttribute("placeholder");
        }

        public String getSumFieldTextForArrears() {
            return driver.findElement(sumFieldForArrears).getAttribute("placeholder");
        }

        public String getEmailFieldForArrears() {
            return driver.findElement(emailFieldForArrears).getAttribute("placeholder");
        }

        public String getNumberIfArrearsFieldText() {
            return driver.findElement(numberIfArrearsField).getAttribute("placeholder");
        }
    }
}