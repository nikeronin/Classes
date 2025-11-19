package yandexUI;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class Main {

    yandextest yandextest = new yandextest();


    @BeforeAll
    static void setupAllureReports() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide()
                .screenshots(true)
        );
    }

    @Test
    void autotest () {

        yandextest.openPage()
                .setTextInput("Курс доллара")
                .click()
                .verifyRedIconIsDisplayed();

    }
}
