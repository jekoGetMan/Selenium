import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class testLog {

    //static WebDriverWait wait;
    private static  WebDriver driver;
    private static log log;
    private static prof prof;
    private static decemberBoys decemberBoys;
    private static purchases purchases;


    @BeforeClass
                                            /* Настройки перед каждым набором тестов */
    public static void setUp(){

        System.setProperty("webdriver.chrome.driver", "C:\\someFiles\\Prg\\Java\\Selenium\\drivers\\chromedriver.exe");

        // Объявляеним объекты, через который можно достучаться до соответствующих страниц
        driver = new ChromeDriver();
        log = new log(driver);
        prof = new prof(driver);
        decemberBoys = new decemberBoys(driver);
        purchases = new purchases(driver);

        // Настройки окна
        driver.manage().window().maximize();

        /* Устанавлием неявное ожидание, при котором selenium будет ждать полной загрузки элемента(макс.20сек).
         Если по истечению даного времени элемент не будет найден - ошибка*/
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

                                                    /* Явное ожидание по картинке */
//        wait  = (new WebDriverWait(driver, 5));
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='logo']/a/img")));

    }

    // негативное тестирование
    @Test
    public void fail(){
        log.log();
        String email = "424242424244fsffs42453524242vfsfsfsfsfsfsfs@gmail.com";
        log.log(email);
        log.pass("tet53353f3fc335c35c3424242444444444444444444444444444444rdc2442");
        log.pushLog();
        String error = "Опаньки! Мы нашли какие-то ошибки - пожалуйста, проверьте сообщения об ошибках ниже и попробуйте еще раз.";
        Assert.assertEquals(error, prof.err());
    }


    // позитивное тестирование
    @Test
    public void normal(){
        log.log();
        String email = "sl1mvsshady@gmail.com";
        log.log(email);
        log.pass("qwerty16");
        log.pushLog();
        prof.cab();
        Assert.assertTrue(prof.mail(email));
        prof.logout();
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }

}