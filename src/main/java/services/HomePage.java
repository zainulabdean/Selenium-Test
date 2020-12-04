package services;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver webDriver;

    By chapter1 = By.linkText("Chapter1");

    public HomePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void goToChapter1(){
        webDriver.findElement(chapter1).click();
        System.out.println("Clicked Chapter 1");
    }
}
