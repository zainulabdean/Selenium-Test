package service.webpage;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {

    public ChapterPage goToChapter1() {
        $(By.linkText("Chapter1")).click();
        System.out.println("Clicked Chapter 1");
        return Selenide.page(ChapterPage.class);
    }
}
