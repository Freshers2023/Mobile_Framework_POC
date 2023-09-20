package mobile.pages.Home;

public class HomeScreen extends HomeLocators {
    public boolean isMenuPresent() {
        return getIconMenu().isDisplayed();
    }

    public String getProductHeaderText() {
        return getProductHeader().getText();
    }
}
