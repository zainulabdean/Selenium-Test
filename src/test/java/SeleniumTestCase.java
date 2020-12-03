import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumTestCase {

    WebDriver driver;
    String text = "Assert that this text is on the page";


    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void testWebPage() throws InterruptedException {

        driver.get("http://book.theautomatedtester.co.uk/");

        HomePage homePage = new HomePage(driver);
        Thread.sleep(3000);

        homePage.goToChapter1();
        Thread.sleep(3000);

        ChapterPage chapter1Page = new ChapterPage(driver);
        Assert.assertEquals(chapter1Page.getText(), text);

        chapter1Page.goToHomePage();
        Thread.sleep(3000);

        driver.quit();

    }

}



