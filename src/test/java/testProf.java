import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;

public class testProf {

    public static WebDriver driver;
    public static log log;
    public static prof prof;
    public static decemberBoys decemberBoys;
    public static purchases purchases;
    public static findElements elementsFields;

        @BeforeClass
    public static void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\someFiles\\Prg\\Java\\Selenium\\drivers\\chromedriver.exe");

        driver = new ChromeDriver();
        log = new log(driver);
        prof = new prof(driver);
        decemberBoys = new decemberBoys(driver);
        purchases = new purchases(driver);
        elementsFields = new findElements(driver);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        log.log();
        String email = "input@gmail.com";
        log.log(email);
        log.pass("12345678");
        log.pushLog();
    }

    @Test
    public void setPurchases(){
        decemberBoys.find();
        decemberBoys.buy();
    }

    @Test
    public void location() {
        prof.cab();
        prof.loc();
        elementsFields.adress();
        elementsFields.form("test","test","test","test", "test","test");
    }

    @AfterClass
    public static void tearDown() {
        prof.logout();
        driver.quit();
    }

}