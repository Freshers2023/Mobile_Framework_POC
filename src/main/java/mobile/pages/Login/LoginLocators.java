package mobile.pages.Login;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import mobile.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LoginLocators extends BasePage {
    public LoginLocators() {
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
    }
    @AndroidFindBy(accessibility = "test-Username")
    public WebElement txtUserName;
    @AndroidFindBy(accessibility = "test-Password")
    public WebElement txtPassword;
    @AndroidFindBy(accessibility = "test-LOGIN")
    public WebElement btnLogin;
}
