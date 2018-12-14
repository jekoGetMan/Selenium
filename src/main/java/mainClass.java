import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class mainClass {
    public static void main(String[] args){

    System.setProperty("webdriver.chrome.driver", "C:\\someFiles\\Prg\\Java\\Selenium\\drivers\\chromedriver.exe");

    WebDriver driver = new ChromeDriver(); // driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
          driver.manage().window().maximize();
//        driver.manage().window().maximize(); // driver.manage().window().setSize(new Dimension(900,500);
//
//        driver.get("https://www.seleniumhq.org");
//        driver.navigate().to("http://seleniumq.org");
//        driver.navigate().back();
//        driver.navigate().forward();
//        driver.navigate().refresh();
//        System.out.println(driver.getTitle());
//        System.out.println(driver.getCurrentUrl());

//        driver.get("https://github.com/");
        // Для хранения элементов создаем переменную WebElement
        // findElement
//        WebElement link = driver.findElement(By.linkText("Log in")); // Найдем элемент; Поиск ссылок
//        WebElement link2 = driver.findElement(By.partialLinkText("Main page")); // Найти ссылку по части текста
//        WebElement searchField = driver.findElement(By.name("mw-panel"));
//        WebElement cls = driver.findElement(By.className("mw-headline"));
//        driver.findElement(By.id("mp-right"));
//        driver.findElement(By.cssSelector("form#searchform"));
//        driver.findElement(By.xpath("//*[@id=\"mp-topbanner\"]/ul/li[1]/a"));

        //driver.findElement(By.xpath("//*[@id=\"searchButton\"]")).click();
//        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div/div/div[2]/div/form/button"));
//        WebElement btn = driver.findElement(By.xpath("//form[@class = 'home-hero-signup js-signup-form']//button"));
//        if (btn.getText().equals("Sign up for GitHub")){
//            System.out.println("Success");
//        } else System.out.println("Fail!");

//        btn.submit();
//        driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/div[2]/a[1]")).click();


//        driver.quit();
    }
}
