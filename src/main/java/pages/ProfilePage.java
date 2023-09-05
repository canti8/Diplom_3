package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProfilePage {

    @FindBy(how = How.CSS, using = ".Account_listItem__35dAP button")
    protected SelenideElement signOutButton;

    @FindBy(how = How.CSS, using = ".AppHeader_header__logo__2D0X2")
    protected SelenideElement logoButton;

}
