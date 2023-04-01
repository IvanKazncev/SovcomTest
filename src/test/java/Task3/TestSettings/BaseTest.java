package Task3.TestSettings;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BaseTest {
    public static WebDriver webDriver;
    public static WebDriverWait wait;

@BeforeEach
      void setWebDriver()  {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        ChromeOptions op = new ChromeOptions();
        op.addArguments("--remote-allow-origins=*");
        webDriver = new ChromeDriver(op);
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(30));
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        webDriver.manage().window().maximize();

    }
@AfterEach
    void shotDown(){
    webDriver.close();
}
}
