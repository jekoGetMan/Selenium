import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class reg {

    public reg(WebDriver driver) {
        /* Используем способ применения pageObject паттерна через класс Selenium - pageFactory и аннотацию @FindBy
        для инициализации страниц вместо тривиального вызова с через объект.(prof profpage = new prof(driver);)
        */
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    public WebDriver driver;

    @FindBy(name = "registration-password1")
    private WebElement pass;
    @FindBy(name = "registration-password2")
    private WebElement pass1;
    @FindBy(name = "registration-email")
    private WebElement mail;
    @FindBy(xpath = "//button[text()='Регистрация']")
    private WebElement reg;

    public void inputEmail(String login) {
        mail.sendKeys(login);
    }

    public void inputPassword(String password) {
        pass.sendKeys(password);
        pass1.sendKeys(password);
    }

    public void clickRegistrationButton() {
        reg.click();
    }
}