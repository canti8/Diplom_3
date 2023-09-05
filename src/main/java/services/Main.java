package services;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import pages.MainPage;

import static com.codeborne.selenide.Condition.visible;

public class Main extends MainPage {

    @Step("Нажать на кнопку логина в хидере")
    public void  goToLoginPageUsingButtonFromHeader(){
        linkToLoginPageFromHeader.click();
    }

    @Step("Нажать на центральную кнопку логина")
    public void  goToLoginPageUsingCentralButton(){
        linkToLoginPageButton.click();
    }

    @Step("Перейти на страницу профиля")
    public void  goToProfilePage(){
        linkToProfilePage.click();
    }

    @Step("Авторизация")
    public void checkUserAuthorised(){
        createOrderButton.shouldHave(Condition.text("Оформить заказ"));
    }

    @Step("Нажать на раздел Булки")
    public void goToBunsClick(){
        bunsTab.click();
    }

    @Step("Нажать на раздел Соусы")
    public void goToSaucesClick(){
        saucesTab.click();
    }

    @Step("Нажать на раздел Начинки")
    public void goToFillingsClick(){
        fillingsTab.click();
    }

    @Step("Проверка видимости блока Конструктор")
    public void checkConstructorBlock(){
        constructorLabel.shouldBe(visible);
    }

    @Step("Проверка перехода в раздел")
    public void checkElementColor(SelenideElement element, String expectedColor) {
        String actualColor = element.getCssValue("color");

        element.shouldNotHave(Condition.cssValue("color", actualColor));

        element.shouldHave(Condition.cssValue("color", expectedColor));
    }

}
