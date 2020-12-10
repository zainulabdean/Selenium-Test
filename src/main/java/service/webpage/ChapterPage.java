package service.webpage;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ChapterPage {

    public SelenideElement getDivFromPage() {
        System.out.println("Finding text");
        return $("#divontheleft");

    }

    public HomePage goToHomePage() {
        $(By.linkText("Home Page")).click();
        System.out.println("Clicked Home Page");
        return Selenide.page(HomePage.class);
    }
}
