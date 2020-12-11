package service.webpage;

import com.codeborne.selenide.Condition;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import util.SeleniumTestUtil;

import java.io.IOException;
import java.util.Properties;

public class SeleniumTestCase {

    Properties properties = null;
    private String textToAssert = "Assert that this text is on the page";

    @BeforeTest
    public void setUp() throws IOException {
        properties = SeleniumTestUtil.loadFile();
    }

    @Test
    public void testWebPage() {

      // Open the home page
      HomePage homePage = new HomePage();
      homePage.openHomePage();

      // Find and click link Chapter1
      ChapterPage chapter1Page = homePage.goToChapter1();

      // Assert text
      chapter1Page.getDivFromPage().shouldHave(Condition.text(textToAssert));

      // Find and click link Homepage
      chapter1Page.goToHomePage();

      // Assert HomePage
      Assert.assertTrue(homePage.verifyHomePage());
    }

}



