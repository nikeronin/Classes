package yandexUI;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

public class SearchButton {


    SelenideElement search3__button;

    public SearchButton(SelenideElement search3__button) {
        this.search3__button = search3__button;
    }

    public SearchButton click() {
        search3__button.shouldBe(Condition.exist);
        search3__button.click();
        return this;
    }
}
