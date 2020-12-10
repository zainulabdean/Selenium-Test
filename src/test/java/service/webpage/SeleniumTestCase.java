package service.webpage;

import com.codeborne.selenide.Condition;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static com.codeborne.selenide.Selenide.open;

public class SeleniumTestCase {

    Properties properties = null;
    String textToAssert = "Assert that this text is on the page";
    private final String WEB_URL = "webpage.home.url";
    private final String APPLICATION_PROPERTY = "application.test.properties";


    @BeforeTest
    public void setUp() throws IOException {
        properties = new Properties();
        properties.load(new FileInputStream(getClass().getClassLoader()
                .getResource(APPLICATION_PROPERTY).getFile()));

    }

    @Test
    public void testWebPage() {

      // Open the home page
      HomePage homePage = open(properties.getProperty(WEB_URL), HomePage.class);

      // Find and click link Chapter1
      ChapterPage chapter1Page = homePage.goToChapter1();

      // Assert text
      chapter1Page.getDivFromPage().shouldHave(Condition.text(textToAssert));

      // Find and click link Homepage
      chapter1Page.goToHomePage();
    }

}



