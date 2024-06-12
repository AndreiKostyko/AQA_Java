import org.testng.Assert;
import base.BaseTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AboutServicePage;

public class Tests extends BaseTest {
    String expNameOfBlock = "Онлайн пополнение\n" + "без комиссии";
    String aboutServicePageURL = "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/";
    String numberOfPhone = "297777777";
    String sumOfPayment = "10";

    // 1. Проверить название указанного блока;
    @Test
    public void testNameOfBlock() {
        Assert.assertEquals(homePage.getNameOfBlock(), expNameOfBlock,
                "Не верное название блока Онлайн пополнение без комиссии");
    }

    // 2. Проверить наличие логотипов платёжных систем;
    @Test
    public void testLogoOfPaySystem() {

        SoftAssert asert = new SoftAssert();
        asert.assertEquals(homePage.logoIsPresenceVisa(), true,
                "Лого Visa отсутствует");
        asert.assertEquals(homePage.logoIsPresenceVerifiedByVisa(), true,
                "Лого Verified By Visa отсутствует");
        asert.assertEquals(homePage.logoIsPresenceMasterCard(), true,
                "Лого MasterCard отсутствует");
        asert.assertEquals(homePage.logoIsPresenceMasterCardSecureCode(), true,
                "Лого MasterCard Secure Code отсутствует");
        asert.assertEquals(homePage.logoIsPresenceBelcard(), true,
                "Лого Белкарт отсутствует");
        asert.assertAll();
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
    public void testContinueBut (){
        homePage.fillPhoneNumberField(numberOfPhone);
        homePage.fillAmountField(sumOfPayment);
        homePage.clickContinueBut();
    }
}