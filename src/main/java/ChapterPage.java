import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChapterPage {
    private WebDriver webDriver;

    By text = By.id("divontheleft");
    By homePage= By.linkText("Home Page");

    public ChapterPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public String getText(){
        System.out.println("Element Found with text(): " + webDriver.findElement(text).getText());
        return webDriver.findElement(text).getText();
    }

    public void goToHomePage(){
        webDriver.findElement(homePage).click();
        System.out.println("Clicked Home Page");
    }

}
