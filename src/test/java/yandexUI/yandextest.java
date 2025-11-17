package yandexUI;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;


public class yandextest {
    SelenideElement TextInput = $(By.name("text"));
    SelenideElement SearchButton = $(By.className("search3__button"));
    SelenideElement YandexRedIcon = $(By.className("HeaderLogo"));

    @Step("Открыть поиск Яндекса")
    public yandextest openPage() {
        Selenide.open("https://ya.ru/");
        return this;
    }


    @Step("Ввести данные в строку поиска")
    public yandextest setTextInput(String text) {
        TextInput.setValue(text);
        return this;
    }


    @Step("Начать поиск")
    public yandextest click() {
        SearchButton.click();
        return this;
    }


    @Step("Проверить отображение красной иконки")
    public yandextest isDisplayed() {
        YandexRedIcon.isDisplayed();
        return this;
    }
}
