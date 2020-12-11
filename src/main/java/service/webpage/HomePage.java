package service.webpage;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class HomePage {

    private static String WEB_URL="http://book.theautomatedtester.co.uk/";

    public ChapterPage goToChapter1() {
        $(By.linkText("Chapter1")).click();
        System.out.println("Clicked Chapter 1");
        return Selenide.page(ChapterPage.class);
    }

    public void openHomePage(){
        open(WEB_URL);
    }

    public Boolean verifyHomePage() {
        return $(By.linkText("Chapter1")).exists();
    }

}
