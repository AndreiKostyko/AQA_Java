import org.testng.Assert;
import base.BaseTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AboutServicePage;
import pages.HomePage;
import pages.PayFrame;

public class Tests extends BaseTest {
    String expNameOfBlock = "Онлайн пополнение\n" + "без комиссии";
    String aboutServicePageURL = "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/";
    String numberOfPhone = "297777777";
    String sumOfPayment = "10";
    int icons = 4;

    // 1. Проверить название указанного блока;
    @Test
    public void testNameOfBlock() {
        Assert.assertEquals(homePage.getNameOfBlock(), expNameOfBlock,
                "Не верное название блока Онлайн пополнение без комиссии");
    }

    // 2. Проверить наличие логотипов платёжных систем;
    @Test
    public void testLogoOfPaySystem() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(homePage.logoIsPresenceVisa(), true,
                "Лого Visa отсутствует");
        softAssert.assertEquals(homePage.logoIsPresenceVerifiedByVisa(), true,
                "Лого Verified By Visa отсутствует");
        softAssert.assertEquals(homePage.logoIsPresenceMasterCard(), true,
                "Лого MasterCard отсутствует");
        softAssert.assertEquals(homePage.logoIsPresenceMasterCardSecureCode(), true,
                "Лого MasterCard Secure Code отсутствует");
        softAssert.assertEquals(homePage.logoIsPresenceBelcard(), true,
                "Лого Белкарт отсутствует");
        softAssert.assertAll();
    }

    //3. Проверить работу ссылки «Подробнее о сервисе»;
    @Test
    public void testАboutServiceLink() {
        AboutServicePage aboutServicePage = homePage.clickMoreАboutServiceLink();
        Assert.assertEquals(aboutServicePage.getAboutServicePageURL(), aboutServicePageURL,
                "Ссылка Подробнее о сервисе не работает");
    }

    //4. Заполнить поля и проверить работу кнопки «Продолжить»
    // (проверяем только вариант «Услуги связи», номер для теста 297777777)
    @Test
    public void testContinueBut() {
        homePage.fillPhoneNumberField(numberOfPhone);
        homePage.fillAmountField(sumOfPayment);
        homePage.clickContinueBut();
    }

    @Test
    public void testConnectionPay() {
        HomePage.ListWhatToPay listWhatToPay = new HomePage.ListWhatToPay();
        listWhatToPay.selectCommunicationServicesPoint();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(listWhatToPay.getPhoneNumberFieldTextForConnection(), "Номер телефона");
        softAssert.assertEquals(listWhatToPay.getSumFieldTextForConnection(), "Сумма");
        softAssert.assertEquals(listWhatToPay.getEmailFieldForConnection(), "E-mail для отправки чека");
        softAssert.assertAll();
    }

    @Test
    public void testInternetPay() {
        HomePage.ListWhatToPay listWhatToPay = new HomePage.ListWhatToPay();
        listWhatToPay.selectHomeInternetPoint();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(listWhatToPay.getPhoneNumberFieldTextForInternet(), "Номер абонента");
        softAssert.assertEquals(listWhatToPay.getSumFieldTextForInternet(), "Сумма");
        softAssert.assertEquals(listWhatToPay.getEmailFieldForInternet(), "E-mail для отправки чека");
        softAssert.assertAll();
    }

    @Test
    public void testInstallmentsPay() {
        HomePage.ListWhatToPay listWhatToPay = new HomePage.ListWhatToPay();
        listWhatToPay.selectInstallmentsPoint();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(listWhatToPay.getNumberIfInstalmentsFieldText(), "Номер счета на 44");
        softAssert.assertEquals(listWhatToPay.getSumFieldTextForInstalments(), "Сумма");
        softAssert.assertEquals(listWhatToPay.getEmailFieldForInstalments(), "E-mail для отправки чека");
        softAssert.assertAll();
    }


    @Test
    public void testArrearsPay() {
        HomePage.ListWhatToPay listWhatToPay = new HomePage.ListWhatToPay();
        listWhatToPay.selectArrearsPoint();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(listWhatToPay.getNumberIfArrearsFieldText(), "Номер счета на 2073");
        softAssert.assertEquals(listWhatToPay.getSumFieldTextForArrears(), "Сумма");
        softAssert.assertEquals(listWhatToPay.getEmailFieldForArrears(), "E-mail для отправки чека");
        softAssert.assertAll();
    }

    @Test
    public void Frame() throws InterruptedException {
        homePage.fillPhoneNumberField(numberOfPhone);
        homePage.fillAmountField(sumOfPayment);
        PayFrame payFrame = homePage.clickContinueButToFrame();
        payFrame.switchToFrame();
        payFrame.getAmountOnHeader();
        payFrame.getAmountOnButton();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(payFrame.getAmountOnHeader(), sumOfPayment + ".00 BYN");
        softAssert.assertEquals(payFrame.getAmountOnButton(), "Оплатить " + sumOfPayment + ".00 BYN");
        softAssert.assertEquals(payFrame.lineWithPhoneNumber(), "Оплата: Услуги связи Номер:375" + numberOfPhone);
        softAssert.assertEquals(payFrame.getCardNumberField(), "Номер карты");
        softAssert.assertEquals(payFrame.getCardExpiryDateField(), "Срок действия");
        softAssert.assertEquals(payFrame.getCardCVCField(), "CVC");
        softAssert.assertEquals(payFrame.getCardHolderNameField(), "Имя держателя (как на карте)");
        softAssert.assertEquals(payFrame.numberPaymentSystemIcons(), icons);
        softAssert.assertAll();
    }
}