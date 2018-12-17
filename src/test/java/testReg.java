import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class testReg {
    public static WebDriver driver;
    public static prof prof;
    public static reg reg;
    public  static log log;

    private static String email = "new@gmail.com";
    private static String password = "12345678";

    @BeforeClass
    public static void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\someFiles\\Prg\\Java\\Selenium\\drivers\\chromedriver.exe");

        driver = new ChromeDriver();
        prof = new prof(driver);
        reg = new reg(driver);
        log = new log(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        log.log();
    }

    @Test
    public void reg(){
        reg.inputEmail(email);
        reg.inputPassword(password);
        reg.clickRegistrationButton();
        prof.cab();
        Assert.assertTrue(prof.mail(email));
        prof.del(password);
    }


    @AfterClass
    public static void tearDown() {
        driver.quit();
    }

}