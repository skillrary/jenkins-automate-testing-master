package ec.com.ucuenca;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.jruby.RubyProcess;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Created by santteegt on 20/07/2017.
 */
public class SeleniumTest {

    private WebDriver driver;
    

    @Test
    public void testEasy() {
        driver.get("http://demo.guru99.com/selenium/guru99home/");
        String title = driver.getTitle();
        Assert.assertTrue(title.contains("Demo Guru99 Page"));
    }
    @BeforeTest
    public void beforeTest() {
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().driverVersion("91.0.4472.101").setup();
        ChromeDriverManager.getInstance().setup();
       
        driver = new ChromeDriver(chromeOptions);
       
    }
    @AfterTest
    public void afterTest() {
        if(driver != null) {
            driver.quit();
        }
    }


}
