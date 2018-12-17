import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class decemberBoys {
    public WebDriver driver;

    public decemberBoys(WebDriver driver) {
        /* Используем способ применения pageObject паттерна через класс Selenium - pageFactory и аннотацию @FindBy
        для инициализации страниц вместо тривиального вызова с через объект.(prof profpage = new prof(driver);)
        */
        PageFactory.initElements(driver, this);
        this.driver = driver;
        driver.get("https://decemberboys.com.ua/shop/");
    }

    public void find() {
        driver.findElement(By.name("search")).sendKeys("DB Cap");
        driver.findElement(By.name("search")).sendKeys(Keys.ENTER);
    }

    @FindBy(xpath = "//*[@id='content_inner']/section/div/div/div/div[2]/div/div[3]/form/button")
    private WebElement buy;

    public void buy() {
        buy.click();
    }

}