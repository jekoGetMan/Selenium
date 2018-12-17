import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class findElements {
    public WebDriver driver;


    public findElements(WebDriver driver) {
        /* Используем способ применения pageObject паттерна через класс Selenium - pageFactory и аннотацию @FindBy
        для инициализации страниц вместо тривиального вызова с через объект.(prof profpage = new prof(driver);)
        */
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy (xpath = "//*[@id='id_line4']")
    private WebElement findCity;
    @FindBy (xpath = "//*[@id='id_postcode']")
    private WebElement findIndex;
    @FindBy (xpath = "//*[@id='id_country']")
    private WebElement findCountry;
    @FindBy(xpath = "//*[@id='content_inner']/a")
    private WebElement fillLocation;
    @FindBy (xpath = "//*[@id='id_first_name']")
    private WebElement nameLocation;
    @FindBy (xpath = "//*[@id='id_last_name']")
    private WebElement lstName;
    @FindBy (xpath = "//*[@id='id_line1']")
    private WebElement fullLocation;
    @FindBy (xpath = "//*[@id='id_phone_number']")
    private WebElement number;



    public void index(String index) {
        findIndex.sendKeys(index);
    }

    public void city(String city) {
        findCity.sendKeys(city);
    }
    public void fullAdress(String address) {
        fullLocation.sendKeys(address);
    }

    public void adress() {
        fillLocation.click();
    }

    public void Name(String name) {
        nameLocation.sendKeys(name);
    }

    public void lstName(String surname) {
        lstName.sendKeys(surname);
    }

    public void Coutry() {
        findCountry.click();
        driver.findElement(By.xpath("//*[@id='id_country']/option[2]")).click();
    }

    public void phoneNumber(String phone) {
        number.sendKeys(phone);
    }

    public void form(String name,String surname,String address,String city,String index,String phone) {
        Name(name);
        lstName(surname);
        fullAdress(address);
        city(city);
        index(index);
        phoneNumber(phone);
        Coutry();
    }
}