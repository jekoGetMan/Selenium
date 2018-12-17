import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class prof {
    public WebDriver driver;

    public prof(WebDriver driver) {
        /* Используем способ применения pageObject паттерна через класс Selenium - pageFactory и аннотацию @FindBy
        для инициализации страниц вместо тривиального вызова с через объект.(prof profpage = new prof(driver);)
        */
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(id = "delete_profile")
    private WebElement del;
    @FindBy (xpath = "//*[@id='login_form']/div[2]")
    private WebElement err;
    @FindBy(id = "my_account")
    private WebElement prof;
    @FindBy(name = "password")
    private WebElement pass;
    @FindBy(xpath = "//*[@id='delete_profile_form']/div[3]/button")
    private WebElement del1;
    @FindBy (xpath = "//*[@id='column-left']/ul[2]/li[5]/a")
    private WebElement loc;


    public void cab() {
        prof.click();
    }

    public void logout() {
        driver.get("https://decemberboys.com.ua/accounts/logout/");
    }

    public void del(String password) {
        del.click();
        input(password);
        del1.click();
    }

    public void input(String password) {

        pass.sendKeys(password);
    }

    public boolean mail (String mail) {
        boolean b = false;
        try {
            driver.findElement(By.xpath("//table[contains(@class, 'table table-striped table-bordered')]/tbody/tr/td[text()='" + mail + "']/.."));
            b = true;
        } catch (Exception E) {

        }
        return b;
    }

    public String err() {
        return err.getText();
    }

    public void loc() {
        loc.click();
    }




}