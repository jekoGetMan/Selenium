import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class log {

    public log(WebDriver driver) {
        /* Используем способ применения pageObject паттерна через класс Selenium - pageFactory и аннотацию @FindBy
        для инициализации страниц вместо тривиального вызова с через объект.(prof profpage = new prof(driver);)
        */
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }


    public WebDriver driver;

    @FindBy(xpath = "//button[text()='Войти']")
    private WebElement btn;
    @FindBy(name = "login-username")
    private WebElement log;
    @FindBy(name = "login-password")
    private WebElement pass;


    public void log() {
        driver.get("https://decemberboys.com.ua/accounts/login/");
    }

    public void pass(String password) {
        pass.sendKeys(password);
    }

    public void log(String login) {
        log.sendKeys(login);
    }


    public void pushLog() {
        btn.click();
    }
}