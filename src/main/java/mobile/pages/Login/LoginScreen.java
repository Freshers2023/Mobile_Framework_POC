package mobile.pages.Login;

import io.qameta.allure.Step;
import mobile.pages.Home.HomeScreen;

public class LoginScreen extends LoginLocators {
    @Step("Entering username")
    public LoginScreen enterOrgName(String name) {
        txtUserName.sendKeys(name);
        return this;
    }
    @Step("Entering password")
    public LoginScreen enterPassword(String password) {
        txtPassword.sendKeys(password);
        return this;
    }
    @Step("click on login button")
    public HomeScreen clickLoginButton() {
        new LoginLocators().btnLogin.click();
        return new HomeScreen();
    }
}
