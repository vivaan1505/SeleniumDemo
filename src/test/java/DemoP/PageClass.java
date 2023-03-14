package DemoP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class PageClass {
    private static WebDriver driver;

    public static void login()
    {

        System.setProperty("webdriver.chrome.driver","C:\\Automation\\ChromeDriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
       // options.setAcceptInsecureCerts(true);
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        //driver.get("https://www.google.com/");
        driver.get("https://expired.badssl.com/");

        System.out.println("Title of the page:"+driver.getTitle());

        driver.quit();




    }
    public static void search() throws InterruptedException {

        driver.findElement(By.name("q")).sendKeys("IBM Jobs");
        Thread.sleep(5000);
        List <WebElement> list = driver.findElements(By.xpath("//body[1]/div[1]/div[3]/form[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/ul[1]/li[2]/div[1]/div[2]/div[1]/div[1]/span[1]"));
        ////ul[@role='listbox']//li/descendant::div[@class='presentation']
        System.out.println(list.size());
    }


    public static void main(String[] args) {


//        PageClass obj = new PageClass();
//        obj.login();


    }
}
