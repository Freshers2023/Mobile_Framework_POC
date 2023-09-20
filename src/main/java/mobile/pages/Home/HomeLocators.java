package mobile.pages.Home;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSBy;
import lombok.Getter;
import mobile.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

@Getter
public class HomeLocators extends BasePage {

    public HomeLocators() {
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
    }

    @iOSBy(accessibility = "IOS_SAMPLE")
    @AndroidFindBy(accessibility = "test-Menu")
    private WebElement iconMenu;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Cart drop zone\"]/android.view.ViewGroup/android.widget.TextView")
    private WebElement productHeader;
}
